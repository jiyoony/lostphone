package lostphoneproject.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import lostphoneproject.PhonemanagementApplication;
import lostphoneproject.domain.Lostandreleased;
import lostphoneproject.domain.Reportedlost;

@Entity
@Table(name = "Phonemanagement_table")
@Data
//<<< DDD / Aggregate Root
public class Phonemanagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String status;

    private String deviceId;

    private Date reportDate;

    @PostPersist
    public void onPostPersist() {
        Reportedlost reportedlost = new Reportedlost(this);
        reportedlost.publishAfterCommit();

        Lostandreleased lostandreleased = new Lostandreleased(this);
        lostandreleased.publishAfterCommit();
    }

    public static PhonemanagementRepository repository() {
        PhonemanagementRepository phonemanagementRepository = PhonemanagementApplication.applicationContext.getBean(
            PhonemanagementRepository.class
        );
        return phonemanagementRepository;
    }
}
//>>> DDD / Aggregate Root

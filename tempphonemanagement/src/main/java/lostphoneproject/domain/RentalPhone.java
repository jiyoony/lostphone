package lostphoneproject.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import lostphoneproject.TempphonemanagementApplication;
import lostphoneproject.domain.Temporaryphonerequested;

@Entity
@Table(name = "RentalPhone_table")
@Data
//<<< DDD / Aggregate Root
public class RentalPhone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private Date rentalStartDate;

    private Date rentalEndDate;

    private String status;

    private String deviceId;

    @PostPersist
    public void onPostPersist() {
        Temporaryphonerequested temporaryphonerequested = new Temporaryphonerequested(
            this
        );
        temporaryphonerequested.publishAfterCommit();
    }

    public static RentalPhoneRepository repository() {
        RentalPhoneRepository rentalPhoneRepository = TempphonemanagementApplication.applicationContext.getBean(
            RentalPhoneRepository.class
        );
        return rentalPhoneRepository;
    }
}
//>>> DDD / Aggregate Root

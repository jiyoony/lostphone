package lostphoneproject.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import lostphoneproject.LostphoneApplication;
import lostphoneproject.domain.Cancellationoflossreport;
import lostphoneproject.domain.Reportedlost;

@Entity
@Table(name = "Lossmanagement_table")
@Data
//<<< DDD / Aggregate Root
public class Lossmanagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date reportDate;

    private String phoneModel;

    private String status;

    private String userName;

    private String userId;

    @PostPersist
    public void onPostPersist() {
        Reportedlost reportedlost = new Reportedlost(this);
        reportedlost.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {
        Cancellationoflossreport cancellationoflossreport = new Cancellationoflossreport(
            this
        );
        cancellationoflossreport.publishAfterCommit();
    }

    public static LossmanagementRepository repository() {
        LossmanagementRepository lossmanagementRepository = LostphoneApplication.applicationContext.getBean(
            LossmanagementRepository.class
        );
        return lossmanagementRepository;
    }

    //<<< Clean Arch / Port Method
    public void applyForATemporaryPhone() {
        //implement business logic here:

        Appliedforatemporaryphone appliedforatemporaryphone = new Appliedforatemporaryphone(
            this
        );
        appliedforatemporaryphone.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root

package lostphoneproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostphoneproject.domain.*;
import lostphoneproject.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Temporaryphonerequested extends AbstractEvent {

    private Long id;
    private String userId;
    private Date rentalStartDate;
    private Date rentalEndDate;
    private String status;
    private String deviceId;

    public Temporaryphonerequested(RentalPhone aggregate) {
        super(aggregate);
    }

    public Temporaryphonerequested() {
        super();
    }
}
//>>> DDD / Domain Event

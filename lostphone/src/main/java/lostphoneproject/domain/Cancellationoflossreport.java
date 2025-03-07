package lostphoneproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostphoneproject.domain.*;
import lostphoneproject.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Cancellationoflossreport extends AbstractEvent {

    private Long id;
    private Date reportDate;
    private String phoneModel;
    private String status;
    private String userName;
    private String userId;

    public Cancellationoflossreport(Lossmanagement aggregate) {
        super(aggregate);
    }

    public Cancellationoflossreport() {
        super();
    }
}
//>>> DDD / Domain Event

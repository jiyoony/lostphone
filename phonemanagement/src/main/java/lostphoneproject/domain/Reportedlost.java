package lostphoneproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostphoneproject.domain.*;
import lostphoneproject.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Reportedlost extends AbstractEvent {

    private Long id;
    private String userId;
    private String status;
    private String deviceId;
    private Date reportDate;

    public Reportedlost(Phonemanagement aggregate) {
        super(aggregate);
    }

    public Reportedlost() {
        super();
    }
}
//>>> DDD / Domain Event

package lostphoneproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import lostphoneproject.domain.*;
import lostphoneproject.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Appliedforatemporaryphone extends AbstractEvent {

    private Long id;
    private Date reportDate;
    private String phoneModel;
    private String status;
    private String userName;
    private String userId;

    public Appliedforatemporaryphone(Lossmanagement aggregate) {
        super(aggregate);
    }

    public Appliedforatemporaryphone() {
        super();
    }
}
//>>> DDD / Domain Event

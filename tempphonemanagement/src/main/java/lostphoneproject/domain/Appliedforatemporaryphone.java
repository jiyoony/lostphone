package lostphoneproject.domain;

import java.util.*;
import lombok.*;
import lostphoneproject.domain.*;
import lostphoneproject.infra.AbstractEvent;

@Data
@ToString
public class Appliedforatemporaryphone extends AbstractEvent {

    private Long id;
    private Date reportDate;
    private String phoneModel;
    private String status;
    private String userName;
    private String userId;
}

package examplefooddelivery.domain;

import examplefooddelivery.domain.*;
import examplefooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPaid extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String paymentId;
    private String paymentPrice;
}



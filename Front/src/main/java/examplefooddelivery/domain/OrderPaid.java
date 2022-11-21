package examplefooddelivery.domain;

import examplefooddelivery.domain.*;
import examplefooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPaid extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String paymentId;
    private String paymentPrice;

    public OrderPaid(Payment aggregate){
        super(aggregate);
    }
    public OrderPaid(){
        super();
    }
}

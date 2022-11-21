package examplefooddelivery.domain;

import examplefooddelivery.domain.*;
import examplefooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;

    public OrderAccepted(Order aggregate){
        super(aggregate);
    }
    public OrderAccepted(){
        super();
    }
}

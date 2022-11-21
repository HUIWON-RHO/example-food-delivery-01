package examplefooddelivery.domain;

import examplefooddelivery.domain.*;
import examplefooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;

    public OrderRejected(Order aggregate){
        super(aggregate);
    }
    public OrderRejected(){
        super();
    }
}

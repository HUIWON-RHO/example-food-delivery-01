package examplefooddelivery.domain;

import examplefooddelivery.domain.*;
import examplefooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;

    public CookStarted(Order aggregate){
        super(aggregate);
    }
    public CookStarted(){
        super();
    }
}

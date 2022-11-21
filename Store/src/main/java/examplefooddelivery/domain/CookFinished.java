package examplefooddelivery.domain;

import examplefooddelivery.domain.*;
import examplefooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;

    public CookFinished(Order aggregate){
        super(aggregate);
    }
    public CookFinished(){
        super();
    }
}

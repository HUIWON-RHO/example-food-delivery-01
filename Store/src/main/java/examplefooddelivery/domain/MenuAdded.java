package examplefooddelivery.domain;

import examplefooddelivery.domain.*;
import examplefooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MenuAdded extends AbstractEvent {

    private Long foodId;
    private String foodName;
    private String price;

    public MenuAdded(Menu aggregate){
        super(aggregate);
    }
    public MenuAdded(){
        super();
    }
}

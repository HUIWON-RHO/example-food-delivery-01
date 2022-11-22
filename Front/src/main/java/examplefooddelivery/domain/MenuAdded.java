package examplefooddelivery.domain;

import examplefooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class MenuAdded extends AbstractEvent {

    private Long food_id;
    private String food_name;
    private String price;
}

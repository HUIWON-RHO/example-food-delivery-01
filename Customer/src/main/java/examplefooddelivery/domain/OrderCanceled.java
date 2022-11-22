package examplefooddelivery.domain;

import examplefooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private Long order_id;
    private String food;
    private Integer price;
    private String customer_id;
}

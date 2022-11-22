package examplefooddelivery.domain;

import examplefooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class OrderPaid extends AbstractEvent {

    private Long id;
    private Long order_id;
    private String payment_id;
    private String payment_price;
}

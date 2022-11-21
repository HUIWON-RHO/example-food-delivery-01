package examplefooddelivery.external;

import lombok.Data;
import java.util.Date;
@Data
public class Payment {

    private Long orderId;
    private String paymentId;
    private String paymentPrice;
}



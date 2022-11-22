package examplefooddelivery.external;

import lombok.Data;
import java.util.Date;
@Data
public class Review {

    private Long reviewId;
    private String customerId;
    private String description;
    private Date date;
}



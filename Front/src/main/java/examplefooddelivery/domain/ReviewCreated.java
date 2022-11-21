package examplefooddelivery.domain;

import examplefooddelivery.domain.*;
import examplefooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ReviewCreated extends AbstractEvent {

    private Long id;
    private Long reviewId;
    private String customerId;
    private String description;
    private Date date;

    public ReviewCreated(Review aggregate){
        super(aggregate);
    }
    public ReviewCreated(){
        super();
    }
}

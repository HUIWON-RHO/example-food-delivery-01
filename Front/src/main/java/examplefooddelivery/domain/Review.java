package examplefooddelivery.domain;

import examplefooddelivery.domain.ReviewCreated;
import examplefooddelivery.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Review_table")
@Data

public class Review  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long reviewId;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String description;
    
    
    
    
    
    private Date date;

    @PostPersist
    public void onPostPersist(){


        ReviewCreated reviewCreated = new ReviewCreated(this);
        reviewCreated.publishAfterCommit();

    }

    public static ReviewRepository repository(){
        ReviewRepository reviewRepository = FrontApplication.applicationContext.getBean(ReviewRepository.class);
        return reviewRepository;
    }




    public static void reviewWrite(DeliveryFinished deliveryFinished){

        /** Example 1:  new item 
        Review review = new Review();
        repository().save(review);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryFinished.get???()).ifPresent(review->{
            
            review // do something
            repository().save(review);


         });
        */

        
    }


}

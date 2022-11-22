package examplefooddelivery.domain;

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
    }

    public static ReviewRepository repository(){
        ReviewRepository reviewRepository = FrontApplication.applicationContext.getBean(ReviewRepository.class);
        return reviewRepository;
    }



    public void reviewWrite(){
        ReviewCreated reviewCreated = new ReviewCreated(this);
        reviewCreated.publishAfterCommit();

    }



}

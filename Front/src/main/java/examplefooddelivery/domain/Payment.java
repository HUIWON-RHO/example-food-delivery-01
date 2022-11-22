package examplefooddelivery.domain;

import examplefooddelivery.domain.OrderPaid;
import examplefooddelivery.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Payment_table")
@Data

public class Payment  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private String paymentId;
    
    
    
    
    
    private String paymentPrice;

    @PostUpdate
    public void onPostUpdate(){


        OrderPaid orderPaid = new OrderPaid(this);
        orderPaid.publishAfterCommit();

    }
    @PreUpdate
    public void onPreUpdate(){
    }

    public static PaymentRepository repository(){
        PaymentRepository paymentRepository = FrontApplication.applicationContext.getBean(PaymentRepository.class);
        return paymentRepository;
    }






}

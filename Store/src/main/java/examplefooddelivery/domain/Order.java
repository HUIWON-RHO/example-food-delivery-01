package examplefooddelivery.domain;

import examplefooddelivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Order_table")
@Data

public class Order  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private String food;
    
    
    
    
    
    private Integer price;
    
    
    
    
    
    private Integer customerId;
    
    
    
    
    
    private Integer customerAddress;
    
    
    
    
    
    private String status;

    @PrePersist
    public void onPrePersist(){
    }
    @PreUpdate
    public void onPreUpdate(){
    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = StoreApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }



    public void accept(){
        OrderAccepted orderAccepted = new OrderAccepted(this);
        orderAccepted.publishAfterCommit();

    }
    public void reject(){
        OrderRejected orderRejected = new OrderRejected(this);
        orderRejected.publishAfterCommit();

    }
    public void cookStart(){
        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();

    }
    public void cookFinish(){
        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();

    }

    public static void passOrderInfo(OrderPaid orderPaid){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPaid.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }
    public static void orderCancel(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }


}

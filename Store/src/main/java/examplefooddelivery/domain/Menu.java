package examplefooddelivery.domain;

import examplefooddelivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Menu_table")
@Data

public class Menu  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long foodId;
    
    
    
    
    
    private String foodName;
    
    
    
    
    
    private String price;

    @PrePersist
    public void onPrePersist(){
    }

    public static MenuRepository repository(){
        MenuRepository menuRepository = StoreApplication.applicationContext.getBean(MenuRepository.class);
        return menuRepository;
    }



    public void addMenu(){
        MenuAdded menuAdded = new MenuAdded(this);
        menuAdded.publishAfterCommit();

    }



}

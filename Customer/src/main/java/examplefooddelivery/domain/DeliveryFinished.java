package examplefooddelivery.domain;

import examplefooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class DeliveryFinished extends AbstractEvent {

    private Long id;
}

package examplefooddelivery.domain;

import examplefooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class OrderAccepted extends AbstractEvent {

    private Long id;
}

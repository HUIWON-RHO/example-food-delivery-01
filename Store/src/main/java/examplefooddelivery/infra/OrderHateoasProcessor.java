package examplefooddelivery.infra;
import examplefooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class OrderHateoasProcessor implements RepresentationModelProcessor<EntityModel<Order>>  {

    @Override
    public EntityModel<Order> process(EntityModel<Order> model) {
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/accept").withRel("accept"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/reject").withRel("reject"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/cookstart").withRel("cookstart"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/cookfinish").withRel("cookfinish"));

        
        return model;
    }
    
}

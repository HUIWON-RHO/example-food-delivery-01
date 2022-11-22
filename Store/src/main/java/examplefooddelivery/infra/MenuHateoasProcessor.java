package examplefooddelivery.infra;
import examplefooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class MenuHateoasProcessor implements RepresentationModelProcessor<EntityModel<Menu>>  {

    @Override
    public EntityModel<Menu> process(EntityModel<Menu> model) {
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/addmenu").withRel("addmenu"));

        
        return model;
    }
    
}

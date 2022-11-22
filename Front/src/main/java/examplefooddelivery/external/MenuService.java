package examplefooddelivery.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name = "Store", url = "${api.url.Store}")
public interface MenuService {
    @RequestMapping(method= RequestMethod.GET, path="/menus/{food_id}")
    public Menu getMenu(@PathVariable("food_id") Long food_id);
}


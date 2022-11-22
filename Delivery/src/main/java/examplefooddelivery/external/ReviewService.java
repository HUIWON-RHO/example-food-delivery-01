package examplefooddelivery.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name = "Front", url = "${api.url.Front}")
public interface ReviewService {
    @RequestMapping(method= RequestMethod.PUT, path="/reviews/{id}/reviewwrite")
    public void reviewWrite(@PathVariable("id") Long review_id);
}


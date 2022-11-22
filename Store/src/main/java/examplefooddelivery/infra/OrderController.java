package examplefooddelivery.infra;
import examplefooddelivery.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

@RestController
// @RequestMapping(value="/orders")
@Transactional
public class OrderController {
    @Autowired
    OrderRepository orderRepository;



    @RequestMapping(value = "orders/{id}/accept",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Order accept(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/accept  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.accept();
            
            orderRepository.save(order);
            return order;
            
    }
    



    @RequestMapping(value = "orders/{id}/reject",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Order reject(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/reject  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.reject();
            
            orderRepository.save(order);
            return order;
            
    }
    



    @RequestMapping(value = "orders/{id}/cookstart",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Order cookStart(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/cookStart  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.cookStart();
            
            orderRepository.save(order);
            return order;
            
    }
    



    @RequestMapping(value = "orders/{id}/cookfinish",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Order cookFinish(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /order/cookFinish  called #####");
            Optional<Order> optionalOrder = orderRepository.findById(id);
            
            optionalOrder.orElseThrow(()-> new Exception("No Entity Found"));
            Order order = optionalOrder.get();
            order.cookFinish();
            
            orderRepository.save(order);
            return order;
            
    }
    



}

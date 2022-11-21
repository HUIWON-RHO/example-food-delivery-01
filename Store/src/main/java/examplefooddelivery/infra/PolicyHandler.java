package examplefooddelivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import examplefooddelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import examplefooddelivery.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired OrderRepository orderRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderPaid'")
    public void wheneverOrderPaid_OrderPass(@Payload OrderPaid orderPaid){

        OrderPaid event = orderPaid;
        System.out.println("\n\n##### listener OrderPass : " + orderPaid + "\n\n");


        

        // Sample Logic //
        Order.orderPass(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCanceled'")
    public void wheneverOrderCanceled_OrderCancel(@Payload OrderCanceled orderCanceled){

        OrderCanceled event = orderCanceled;
        System.out.println("\n\n##### listener OrderCancel : " + orderCanceled + "\n\n");


        

        // Sample Logic //
        Order.orderCancel(event);
        

        

    }

}



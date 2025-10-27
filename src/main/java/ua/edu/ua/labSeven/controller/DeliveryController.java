package ua.edu.ua.labseven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ua.labseven.delivery.DHLDeliveryStrategy;
import ua.edu.ua.labseven.delivery.Delivery;
import ua.edu.ua.labseven.delivery.PostDeliveryStrategy;

@RestController
public class DeliveryController {
    
    @GetMapping("/postaldelivery")
    public double postalDelivery(@RequestParam double orderPrice) {
        Delivery delivery = new PostDeliveryStrategy();
        return delivery.delivery(orderPrice);
    }

    @GetMapping("/DHLdelivery")
    public double DHLDelivery(@RequestParam double orderPrice) {
        Delivery delivery = new DHLDeliveryStrategy();
        return delivery.delivery(orderPrice);
    }
}

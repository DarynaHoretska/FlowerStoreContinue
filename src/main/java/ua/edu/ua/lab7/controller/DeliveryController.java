package ua.edu.ua.lab7.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ua.lab7.delivery.DHLDeliveryStrategy;
import ua.edu.ua.lab7.delivery.Delivery;


import ua.edu.ua.lab7.delivery.PostDeliveryStrategy;

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

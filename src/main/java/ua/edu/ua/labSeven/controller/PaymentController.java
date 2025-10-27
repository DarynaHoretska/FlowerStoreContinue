package ua.edu.ua.labseven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ua.labseven.payment.CreditCardPaymentStrategy;
import ua.edu.ua.labseven.payment.PayPalPaymentStrategy;
import ua.edu.ua.labseven.payment.Payment;

@RestController
public class PaymentController {
    @GetMapping("/creditcard")
    public double creditCard(@RequestParam double orderPrice) {
        Payment payment = new CreditCardPaymentStrategy();
        return payment.payment(orderPrice);
    }

    @GetMapping("/paypal")
    public double payPal(@RequestParam double orderPrice) {
        Payment payment = new PayPalPaymentStrategy();
        return payment.payment(orderPrice);
    }
}

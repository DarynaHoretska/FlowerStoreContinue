package ua.edu.ua.lab7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.edu.ua.labSeven.delivery.DHLDeliveryStrategy;
import ua.edu.ua.labSeven.delivery.PostDeliveryStrategy;
import ua.edu.ua.labSeven.payment.CreditCardPaymentStrategy;
import ua.edu.ua.labSeven.payment.PayPalPaymentStrategy;

public class OrderTests {
    @Test
    void testDHLDelivery() {
        DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();
        assertEquals(0, dhl.delivery(600));
        assertEquals(100, dhl.delivery(400));
    }

    @Test
    void testPostDelivery() {
        PostDeliveryStrategy post = new PostDeliveryStrategy();
        assertEquals(0, post.delivery(1200));
        assertEquals(100, post.delivery(800));
    }

    @Test
    void testCreditCardPayment() {
        CreditCardPaymentStrategy cc = new CreditCardPaymentStrategy();
        assertEquals(500, cc.payment(500));
    }

    @Test
    void testPayPalPayment() {
        PayPalPaymentStrategy paypal = new PayPalPaymentStrategy();
        assertEquals(700, paypal.payment(700));
    }
}


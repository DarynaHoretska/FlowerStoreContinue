package ua.edu.ua.lab7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.edu.ua.labSeven.delivery.DHLDeliveryStrategy;
import ua.edu.ua.labSeven.delivery.PostDeliveryStrategy;
import ua.edu.ua.labSeven.payment.CreditCardPaymentStrategy;
import ua.edu.ua.labSeven.payment.PayPalPaymentStrategy;

public class OrderTests {
    private static final int STO = 100;
    private static final int CHOTYRYSTA = 400;
    private static final int SHISTSOT = 600;
    private static final int TYSHYDVISTY = 1200;

    @Test
    void testDHLDelivery() {
        DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();
        assertEquals(0, dhl.delivery(SHISTSOT));
        assertEquals(STO, dhl.delivery(CHOTYRYSTA));
    }

    @Test
    void testPostDelivery() {
        PostDeliveryStrategy post = new PostDeliveryStrategy();
        assertEquals(0, post.delivery(TYSHYDVISTY));
        assertEquals(STO, post.delivery(SHISTSOT));
    }

    @Test
    void testCreditCardPayment() {
        CreditCardPaymentStrategy cc = new CreditCardPaymentStrategy();
        assertEquals(CHOTYRYSTA, cc.payment(CHOTYRYSTA));
    }

    @Test
    void testPayPalPayment() {
        PayPalPaymentStrategy paypal = new PayPalPaymentStrategy();
        assertEquals(SHISTSOT, paypal.payment(SHISTSOT));
    }
}


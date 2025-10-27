package ua.edu.ua.labseven;

import static org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ua.edu.ua.labseven.delivery.DHLDeliveryStrategy;
import ua.edu.ua.labseven.delivery.PostDeliveryStrategy;
import ua.edu.ua.labseven.payment.CreditCardPaymentStrategy;
import ua.edu.ua.labseven.payment.PayPalPaymentStrategy;

public class OrderTests {
    private static final int STO = 100;
    private static final int CHOTYRYSTA = 400;
    private static final int SHISTSOT = 600;
    private static final int TYSHYDVISTY = 1200;

    @Test
    void testDHLDelivery() {
        DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();
        Assertions.assertEquals(0, dhl.delivery(SHISTSOT));
        Assertions.assertEquals(STO, dhl.delivery(CHOTYRYSTA));
    }

    @Test
    void testPostDelivery() {
        PostDeliveryStrategy post = new PostDeliveryStrategy();
        Assertions.assertEquals(0, post.delivery(TYSHYDVISTY));
        Assertions.assertEquals(STO, post.delivery(SHISTSOT));
    }

    @Test
    void testCreditCardPayment() {
        CreditCardPaymentStrategy cc = new CreditCardPaymentStrategy();
        Assertions.assertEquals(CHOTYRYSTA, cc.payment(CHOTYRYSTA));
    }

    @Test
    void testPayPalPayment() {
        PayPalPaymentStrategy paypal = new PayPalPaymentStrategy();
        Assertions.assertEquals(SHISTSOT, paypal.payment(SHISTSOT));
    }
}


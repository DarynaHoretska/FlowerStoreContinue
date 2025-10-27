package ua.edu.ua.labSeven.payment;

public class PayPalPaymentStrategy implements Payment {
    public double payment(double orderPrice) {
        System.out.println("You have to pay " + orderPrice + "by PayPal.");
        return orderPrice;
    }
}

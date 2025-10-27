package ua.edu.ua.labseven.payment;

public class CreditCardPaymentStrategy implements Payment {
    public double payment(double orderPrice) {
        System.out.println("You have to pay "
 + orderPrice + " by credit card.");
        return orderPrice;
    }
}


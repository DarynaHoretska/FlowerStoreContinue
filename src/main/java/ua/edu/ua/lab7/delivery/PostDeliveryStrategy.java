package ua.edu.ua.lab7.delivery;

public class PostDeliveryStrategy implements Delivery{
    public double delivery(double orderPrice){
        if (orderPrice > 1000){
            System.out.println("It was postal delivery. 0 grn for delivery cost");
            return 0;
        }
        System.out.println("It was postal delivery. 100 grn for delivery cost");
        return 100;
    }
}

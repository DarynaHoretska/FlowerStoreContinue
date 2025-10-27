package ua.edu.ua.labSeven.delivery;

public class DHLDeliveryStrategy implements Delivery{
    public double delivery(double orderPrice){
        if (orderPrice > 500){
            System.out.println("It was DHL delivery. 0 grn for delivery cost");
            return 0;
        }
        System.out.println("It was DHL delivery. 100 grn for delivery cost");
        return 100;
    }
}

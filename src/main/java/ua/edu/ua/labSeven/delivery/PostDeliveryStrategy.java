package ua.edu.ua.labseven.delivery;

public class PostDeliveryStrategy implements Delivery {
    private static int TYSHA = 1000;
    private static int STO = 100;
    public double delivery(double orderPrice) {
        if (orderPrice > TYSHA) {
            System.out.println("It was postal delivery. 0 grn for delivery cost");
            return 0;
        }
        System.out.println("It was postal delivery. 100 grn for delivery cost");
        return STO;
    }
}

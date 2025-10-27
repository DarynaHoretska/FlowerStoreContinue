package ua.edu.ua.labseven.delivery;

public class DHLDeliveryStrategy implements Delivery {
    private static int FIF = 500;
    private static int STO = 100;
    public double delivery(double orderPrice) {
        if (orderPrice > FIF) {
            System.out.println("It was DHL delivery. 0 grn for delivery cost");
            return 0;
        }
        System.out.println("It was DHL delivery. 100 grn for delivery cost");
        return STO;
    }
}

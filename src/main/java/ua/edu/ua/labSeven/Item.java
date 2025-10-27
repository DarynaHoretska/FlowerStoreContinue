package ua.edu.ua.labseven;

import lombok.Data;
import ua.edu.ua.labseven.flower.FlowerBucket;

@Data
public class Item {
    private FlowerBucket flowerBucket;

    public double getPrice(){
        return flowerBucket.getPrice();
    }
}

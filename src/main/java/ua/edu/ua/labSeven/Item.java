package ua.edu.ua.labSeven;

import lombok.Data;
import ua.edu.ua.labSeven.flower.FlowerBucket;

@Data
public class Item {
    private FlowerBucket flowerBucket;

    public double getPrice(){
        return flowerBucket.getPrice();
    }
}

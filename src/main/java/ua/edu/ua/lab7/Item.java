package ua.edu.ua.lab7;

import lombok.Data;
import ua.edu.ua.lab7.flower.FlowerBucket;

@Data
public class Item {
    private FlowerBucket flowerBucket;

    public double getPrice(){
        return flowerBucket.getPrice();
    }
}

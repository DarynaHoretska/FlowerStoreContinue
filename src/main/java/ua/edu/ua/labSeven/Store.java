package ua.edu.ua.labseven;

import java.util.ArrayList;
import java.util.List;

import ua.edu.ua.labseven.flower.FlowerBucket;
import ua.edu.ua.labseven.flower.FlowerPack;

public class Store {
    private List<FlowerPack> flowerPacks;
    private List<FlowerBucket> flowerBuckets;

    public Store(){
        this.flowerPacks = new ArrayList<>();
        this.flowerBuckets = new ArrayList<>();
    }

    public void addFlowerPack(FlowerPack flowerPack){
        flowerPacks.add(flowerPack);
    }
    public void addFlowerBucket(FlowerBucket flowerBucket){
        flowerBuckets.add(flowerBucket);
    }

    public double getSum(){
        double packsPrice = flowerPacks.stream().mapToDouble(FlowerPack::getPrice).sum();
        double bucketsPrice = flowerBuckets.stream().mapToDouble(FlowerBucket::getPrice).sum();
        double res = packsPrice + bucketsPrice;
        return res;
    }

}

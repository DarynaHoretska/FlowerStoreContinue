package ua.edu.ua.labseven.flower;

import lombok.Data;

@Data
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public void setFlower(Flower other) {
        this.flower = new Flower(other);
    }
    public double getPrice() {
        return flower.getPrice()*quantity;
    }
}

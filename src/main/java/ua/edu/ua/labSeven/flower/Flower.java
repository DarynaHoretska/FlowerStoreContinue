package ua.edu.ua.labseven.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower other){
        this.sepalLength = other.sepalLength;
        this.color = other.color;
        this.price = other.price;
        this.flowerType = other.flowerType;
    }

    public String getColor() {
        return color.toString();
    }
}

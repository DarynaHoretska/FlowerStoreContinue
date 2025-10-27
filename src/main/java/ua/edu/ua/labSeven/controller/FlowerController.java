package ua.edu.ua.labseven.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ua.labseven.flower.Flower;
import ua.edu.ua.labseven.flower.FlowerColor;
import ua.edu.ua.labseven.flower.FlowerType;

@RestController
public class FlowerController {
    private static final double BASE_DELIVERY_COST = 100.0;
    private static final double DISCOUNT_THRESHOLD = 10.0;

    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return List.of(
            new Flower(DISCOUNT_THRESHOLD, FlowerColor.BLUE, BASE_DELIVERY_COST, FlowerType.TULIP)
        );
    }
}

package ua.edu.ua.lab7.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ua.lab7.flower.Flower;
import ua.edu.ua.lab7.flower.FlowerColor;
import ua.edu.ua.lab7.flower.FlowerType;

@RestController
public class FlowerController {

    @GetMapping("/flowers")
    public List<Flower> getFlowers(){
        return List.of(
            new Flower(10.0, FlowerColor.BLUE, 100.0, FlowerType.TULIP)
        );
    }
}

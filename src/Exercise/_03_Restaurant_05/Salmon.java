package src.Exercise._03_Restaurant_05;

import java.math.BigDecimal;

public class Salmon extends MainDish {
    final static double SALMON_GRAMS = 22;
    public Salmon(String name, BigDecimal price) {
        super(name, price, SALMON_GRAMS);
    }
}

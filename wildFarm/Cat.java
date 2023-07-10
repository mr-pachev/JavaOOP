package wildFarm;

import java.text.DecimalFormat;

public class Cat extends Felima{
    private String breed;
    public Cat(String animalName, String animType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        super.setFoodEaten(this.getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %s, %d]",
                this.getAnimType(),
                super.getAnimalName(),
                this.breed,
                df.format(super.getAnimalWeight()),
                super.getLivingRegion(),
                super.getFoodEaten());
    }
}

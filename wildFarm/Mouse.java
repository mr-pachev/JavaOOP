package wildFarm;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animType, Double animalWeight, String livingRegion) {
        super(animalName, animType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            System.out.printf(String.format("%ss are not eating that type of food!", this.getAnimType()));
        }
        else {
            super.setFoodEaten(food.getQuantity());
        }
    }
}

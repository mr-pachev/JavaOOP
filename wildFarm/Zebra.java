package wildFarm;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animType, Double animalWeight, String livingRegion) {
        super(animalName, animType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
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

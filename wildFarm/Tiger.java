package wildFarm;

public class Tiger extends Felima {
    public Tiger(String animalName, String animType, Double animalWeight, String livingRegion) {
        super(animalName, animType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            System.out.printf(String.format("%ss are not eating that type of food!", this.getAnimType()));
        } else {
            super.setFoodEaten(food.getQuantity());
        }

    }
}

package wildFarm;

public abstract class Animal {
    private String animalName;
    private String animType;
    private Double animalWeight;
    private Integer foodEaten;

    public Animal(String animalName, String animType, Double animalWeight) {
        this.animalName = animalName;
        this.animType = animType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimType() {
        return animType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }
}

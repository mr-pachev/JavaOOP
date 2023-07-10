package wildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;


    public Mammal(String animalName, String animType, Double animalWeight, String livingRegion) {
        super(animalName, animType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }



    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.##");

        return String.format("%s[%s, %s, %s, %d]", this.getAnimType(), super.getAnimalName(), df.format(super.getAnimalWeight()), this.livingRegion, super.getFoodEaten());
    }
}

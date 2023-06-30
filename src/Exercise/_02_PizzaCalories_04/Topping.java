package src.Exercise._02_PizzaCalories_04;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    public double calculateCalories (){
        return (this.weight * 2) * getModifier();
    }

    private double getModifier(){
        switch (this.toppingType){
            case "Meat":
                return 1.2;
            case "Veggies":
                return 0.8;
            case "Cheese":
                return 1.1;
            case "Sauce":
               return  0.9;
            default:
                return 0;
        }
    }

    private void setToppingType(String toppingType) {
        switch (toppingType){
            case "Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.toppingType = toppingType;
                break;
            default:
                String message = String.format("Cannot place %s on top of your pizza.", toppingType);
                throw new IllegalArgumentException(message);
        }

    }

    private void setWeight(double weight) {
        if ( weight < 1 || weight > 50){
            String message = String.format("%s weight should be in the range [1..50].", this.toppingType);
            throw new IllegalArgumentException(message);
        }
        this.weight = weight;
    }


}

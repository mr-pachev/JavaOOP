package src.Exercise_02_PizzaCalories_04;

import java.util.List;

public class Pizza {
private String name;
private Dough dough;
private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }



    private void setName(String name) {
        this.name = name;
    }


}

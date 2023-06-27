package src.Exercise_02_PizzaCalories_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaInfo = scanner.nextLine().split(" ");
        String pizzaName = pizzaInfo[1];
        int numberOfToppings = Integer.parseInt( pizzaInfo[2]);

        String[] doughInfo = scanner.nextLine().split(" ");
        String flourType = doughInfo[1];
        String bakingTechnique = doughInfo[2];
        double doughWeightInGrams = Double.parseDouble(doughInfo[3]);

        String input = scanner.nextLine();
        try{
        Pizza pizza =  new Pizza(pizzaName, numberOfToppings);
        Dough dough = new Dough(flourType, bakingTechnique, doughWeightInGrams);
        pizza.setDough(dough);
        while (!"END".equals(input)){
            String[] toppingInfo = input.split(" ");
            String toppingType = toppingInfo[1];
            double toppingWeightInGrams = Double.parseDouble(toppingInfo[2]);

            Topping topping = new Topping(toppingType, toppingWeightInGrams);
            pizza.addTopping(topping);

            input = scanner.nextLine();
        }
        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}

package src.Exercise._04_FoodShortage_04;

import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPerson = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyerMap = new HashMap<>();

        for (int i = 1; i <= numPerson; i++) {
            String[] personData = scanner.nextLine().split("\\s+");

            String name = personData[0];
            int age = Integer.parseInt(personData[1]);

            if (personData.length == 4) {
                String id = personData[2];
                String birthDate = personData[3];

                Citizen citizen = new Citizen(name, age, id, birthDate);
                buyerMap.put(name, citizen);

            } else {
                String group = personData[2];
                Rebel rebel = new Rebel(name, age, group);
                buyerMap.put(name, rebel);
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String currentName = input;

            if (buyerMap.containsKey(currentName)) {
                buyerMap.get(currentName).buyFood();
            }

            input = scanner.nextLine();
        }

      int allSumBuyFood = buyerMap.values().stream()
                .mapToInt(Buyer::getFood)
                .sum();
        System.out.println(allSumBuyFood);
    }
}

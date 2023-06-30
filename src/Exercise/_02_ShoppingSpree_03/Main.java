package src.Exercise._02_ShoppingSpree_03;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputDataFirstLine = scanner.nextLine().split(";");
        String[] inputDataSecondLine = scanner.nextLine().split(";");

        Map<String, Person> personMap = new LinkedHashMap<>();

        //пълнене на мапа с хора от входа
        for (int i = 0; i < inputDataFirstLine.length; i++) {
            String name = inputDataFirstLine[i].split("=")[0];
            double money = Double.parseDouble(inputDataFirstLine[i].split("=")[1]);
            Person person = new Person(name, money);
            if (!personMap.containsKey(name)){
                personMap.put(name, person);
            }

        }

        Map<String, Product> productsMap = new LinkedHashMap<>();
        //пълнене на мапа с продукти от входа
        for (int i = 0; i < inputDataSecondLine.length; i++) {
            String name = inputDataSecondLine[i].split("=")[0];
            double cost = Double.parseDouble(inputDataSecondLine[i].split("=")[1]);
            Product product = new Product(name, cost);
            if (!productsMap.containsKey(name)){
                productsMap.put(name, product);
            }

        }

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String namePerson = input.split(" ")[0];
            String nameProduct = input.split(" ")[1];

            Person person = personMap.get(namePerson);          //взимаме текущия човек от мапа
            Product product = productsMap.get(nameProduct);     //взимаме искания продукт от мапа

            person.buyProduct(product);                         //проверява, и/или добавя и принтира продукта към дадения човек

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            if (entry.getValue().getProducts().isEmpty()) {
                System.out.printf("%s - Nothing bought", entry.getKey());
            } else {
                System.out.printf("%s - ", entry.getKey());
                List<Product> currentProduct = entry.getValue().getProducts();
                System.out.println(currentProduct.toString().replaceAll("[\\[\\],]", "")
                        .replaceAll(" ", ", "));
            }
        }
    }
}

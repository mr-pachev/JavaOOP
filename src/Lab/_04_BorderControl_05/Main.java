package src.Lab._04_BorderControl_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Identifiable> identifiableList = new ArrayList<>();

        while (!"End".equals(input)) {
            String[] inputData = input.split("\\s+");

            if (inputData.length == 2) {
                String model = inputData[0];
                String id = inputData[1];
                Identifiable robot = new Robot(id, model);
                identifiableList.add(robot);

            } else if (inputData.length == 3) {
                String name = inputData[0];
                int age = Integer.parseInt(inputData[1]);
                String id = inputData[2];
                Identifiable citizen = new Citizen(name, age, id);
                identifiableList.add(citizen);
            }

            input = scanner.nextLine();
        }
        String fakeId = scanner.nextLine();

        for (Identifiable identifiable : identifiableList) {
            if (identifiable.getId().endsWith(fakeId)) {
                System.out.println(identifiable.getId());
            }
        }
    }
}

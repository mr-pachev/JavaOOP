package src.Exercise._04_BirthdayCelebrations_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Birthable> birthableList = new ArrayList<>();

        while (!"End".equals(input)) {
            String[] inputData = input.split("\\s+");

            String typeBirthable = inputData[0];

            if (typeBirthable.equals("Citizen")) {
                String name = inputData[1];
                int age = Integer.parseInt(inputData[2]);
                String id = inputData[3];
                String birthDate = inputData[4];
                Citizen citizen = new Citizen(name, age, id, birthDate);
                birthableList.add(citizen);

            } else if (typeBirthable.equals("Pet")) {
                String name = inputData[1];
                String birthDate = inputData[2];
                Pet pet = new Pet(name, birthDate);
                birthableList.add(pet);
            }

            input = scanner.nextLine();
        }

        String aSpecificYear = scanner.nextLine();

       boolean isFound = false;

       for (Birthable birthable : birthableList){
           if (birthable.getBirthDate().endsWith(aSpecificYear)){
               System.out.println(birthable.getBirthDate());
               isFound = true;
           }
       }

       if(!isFound){
           System.out.println("<no output>");
       }

    }
}

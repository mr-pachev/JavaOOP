package src.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _07_EnterNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startRange = 1;
        int endRange = 100;

        List<Integer> numList = new ArrayList<>();

        while (numList.size() < 10){
            String input = scanner.nextLine();
            try {
                int currentNum = Integer.parseInt(input);

                if (currentNum <= startRange || currentNum >= endRange){
                    System.out.printf("Your number is not in range %d - 100!%n", startRange);

                }else {
                    startRange = currentNum;
                    numList.add(currentNum);
                }

            }catch (NumberFormatException ex){
                System.out.println("Invalid Number!");
            }
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", "")
                .replaceAll(" ", ", "));
    }
}

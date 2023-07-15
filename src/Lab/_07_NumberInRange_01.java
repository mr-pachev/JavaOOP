package src.Lab;

import java.util.Scanner;

public class _07_NumberInRange_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String range = scanner.nextLine();

        int startRange = Integer.parseInt(range.split(" ")[0]);
        int endRange = Integer.parseInt(range.split(" ")[1]);

        System.out.printf("Range: [%d...%d]%n", startRange, endRange);

        while (true){
            String input = scanner.nextLine();

            try {
                int currentNum = Integer.parseInt(input);

                if (currentNum >= startRange && currentNum <= endRange){
                    System.out.printf("Valid number: %d", currentNum);
                    break;
                }else {
                    System.out.printf("Invalid number: %d%n", currentNum);
                }
            }catch (NumberFormatException ex){
                System.out.printf("Invalid number: %s%n", input);
            }


        }

    }
}

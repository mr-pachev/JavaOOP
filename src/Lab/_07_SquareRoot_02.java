package src.Lab;

import java.util.Scanner;

public class _07_SquareRoot_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        try {
            int num = Integer.parseInt(input);
            System.out.printf("%.2f%n", squareNum(num));

        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }

    public static double squareNum(int num) {
        if (num < 1) {
            throw new ArithmeticException();
        }
        return Math.sqrt(num);
    }

}

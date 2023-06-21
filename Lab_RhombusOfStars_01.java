import java.util.Scanner;

public class Lab_RhombusOfStars_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            printRow(i, n - i);
        }

        for (int i = n - 1; i > 0; i--) {
            printRow(i, n - i);
        }
    }

    public static void printRow(int n, int countOfSpace) {

        for (int i = 1; i <= countOfSpace; i++) {
            System.out.print(" ");
        }
        for (int row = 1; row <= n; row++) {
            System.out.print("* ");
        }
        System.out.println();

    }

}

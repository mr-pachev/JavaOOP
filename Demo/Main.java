package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimestionsMatrix = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimestionsMatrix[0];
        int cols = dimestionsMatrix[1];

        int[][] matrix = new int[rows][cols];

        fillMatrix(rows, cols, matrix);

        String command = scanner.nextLine();

        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediPosition = Arrays.stream(command.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] evilPosititon = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int currentRowEvil = evilPosititon[0];
            int currentColEvil = evilPosititon[1];
            evilMovement(matrix, currentRowEvil, currentColEvil);

            int currentRowJedi = jediPosition[0];
            int currentColJedi = jediPosition[1];
            sum = getSumJediMovement(matrix, sum, currentRowJedi, currentColJedi);

            command = scanner.nextLine();
        }

        System.out.println(sum);
    }

    //движение наджедая и сумиране на стойностите от клетките
    private static long getSumJediMovement(int[][] matrix, long sum, int currentRowJedi, int currentColJedi) {
        while (currentRowJedi >= 0 && currentColJedi < matrix[0].length) {
            if (isValidPosition(matrix, currentRowJedi, currentColJedi)) {
                sum += matrix[currentRowJedi][currentColJedi];
            }
            currentColJedi++;
            currentRowJedi--;
        }
        return sum;
    }

    //движение на злото
    private static void evilMovement(int[][] matrix, int currentRowEvil, int currentColEvil) {
        while (currentRowEvil >= 0 && currentColEvil >= 0) {
            if (isValidPosition(matrix, currentRowEvil, currentColEvil)) {
                matrix[currentRowEvil][currentColEvil] = 0;
            }
            currentRowEvil--;
            currentColEvil--;
        }
    }

    //пълнене на матрицата
    private static void fillMatrix(int rows, int cols, int[][] matrix) {
        int value = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }
    }

    //валидация на позицията
    public static boolean isValidPosition(int[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
    }
}

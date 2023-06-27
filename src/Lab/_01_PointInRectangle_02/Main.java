package src.Lab._01_PointInRectangle_02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputData = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bottomLeftX = inputData[0];
        int bottomLeftY = inputData[1];

        int topRightX = inputData[2];
        int topRightY = inputData[3];

        Point pointBottom = new Point(bottomLeftX, bottomLeftY);
        Point pointTop = new Point(topRightX, topRightY);

        Rectangle rectangle = new Rectangle(pointBottom, pointTop);

        int numCheckPoints = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numCheckPoints; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            scanner.nextLine();
            Point point = new Point(x, y);
            System.out.println(rectangle.contains(point));
        }

    }
}

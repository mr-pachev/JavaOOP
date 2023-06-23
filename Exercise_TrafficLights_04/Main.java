package Exercise_TrafficLights_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split("\\s+");

        int scrollingNum = Integer.parseInt(scanner.nextLine());
        List<Colors> trafficLight = new ArrayList<>();


        for (String inputDatum : inputData) {
            trafficLight.add(Colors.valueOf(inputDatum));
        }

        for (int i = 0; i < scrollingNum; i++) {
            changeColor(trafficLight);

            System.out.println(trafficLight.toString().replaceAll("[\\[\\],]", ""));
        }

    }

    private static List<Colors> changeColor(List<Colors> colors) {
        for (int i = 0; i < colors.size(); i++) {
            switch (colors.get(i)) {
                case RED:
                    colors.set(i, Colors.GREEN);
                    break;
                case GREEN:
                    colors.set(i, Colors.YELLOW);
                    break;
                case YELLOW:
                    colors.set(i, Colors.RED);
                    break;
            }
        }
        return colors;
    }
}

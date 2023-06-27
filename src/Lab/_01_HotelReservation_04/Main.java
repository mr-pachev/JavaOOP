package src.Lab._01_HotelReservation_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(inputData[0]);
        int numberOfDays = Integer.parseInt(inputData[1]);
        String currentSeason = inputData[2];
        String currentDiscountType = inputData[3];

        Season season = Season.valueOf(currentSeason);
        DiscountType discountType = DiscountType.valueOf(currentDiscountType);

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay, numberOfDays, season, discountType);

        System.out.printf("%.2f", priceCalculator.calculateAllPrice());
    }
}

package src.Exercise._01_CardSuit_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println("Card Suits:");

       for (CardSuits cardSuits: CardSuits.values()){
           System.out.printf("Ordinal value: %d; Name value: %s", cardSuits.ordinal(), cardSuits.name());
           System.out.println();
       }

    }
}

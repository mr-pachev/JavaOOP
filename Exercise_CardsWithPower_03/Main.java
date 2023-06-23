package Exercise_CardsWithPower_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rankPower = scanner.nextLine();
        String suitPower = scanner.nextLine();

        RankPowers rankPowers = RankPowers.valueOf(rankPower);
        SuitPowers suitPowers = SuitPowers.valueOf(suitPower);
        Card card = new Card(rankPowers, suitPowers);

        System.out.printf("Card name: %s of %s; Card power: %d", rankPower, suitPower, card.sumPowers());
    }
}

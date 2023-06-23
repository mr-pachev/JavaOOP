package Exercise_CardsWithPower_03;

public class Card {
    private RankPowers rankPowers;
    private SuitPowers suitPowers;

    public Card(RankPowers rankPowers, SuitPowers suitPowers) {
        this.rankPowers = rankPowers;
        this.suitPowers = suitPowers;
    }

    public int sumPowers (){
        return this.rankPowers.getRankPowerPower() + this.suitPowers.getSuitPower();
    }

}

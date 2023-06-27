package src.Lab._01_HotelReservation_04;

public class PriceCalculator {
    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int numberOfDays, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }

    public double calculateAllPrice() {
        return this.pricePerDay * this.numberOfDays * this.season.getValue() * this.discountType.getValue();
    }
}

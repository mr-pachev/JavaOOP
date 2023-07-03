package src.Lab._04_CarShopExtended_02;

public class Seat  extends CarImpl implements Sellable{
    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }


    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", this.getModel(), this.countryProduced(), TIRES);
    }

    @Override
    public Double getPrice() {
        return null;
    }
}

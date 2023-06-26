package Lab._01_HotelReservation_04;

public enum DiscountType {
    VIP(0.8), SecondVisit(0.9), None(1);

    private double value;

    DiscountType(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

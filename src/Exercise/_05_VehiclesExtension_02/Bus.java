package src.Exercise._05_VehiclesExtension_02;

public class Bus extends VehicleImpl {
    public static final boolean DEFAULT_IS_EMPTY = true;
    private boolean isEmpty;

    public Bus(double fuelQuantity, double litersPerKm, double tankCapacity) {
        super(fuelQuantity, litersPerKm, tankCapacity);
        this.isEmpty = DEFAULT_IS_EMPTY;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public void setLitersPerKm(double litersPerKm) {
        super.setLitersPerKm(litersPerKm);
    }
}

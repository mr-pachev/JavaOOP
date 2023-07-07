package src.Exercise._05_VehiclesExtension_02;

public class Car extends VehicleImpl {

    private final static double AC_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double litersPerKm, double tankCapacity) {
        super(fuelQuantity, litersPerKm + AC_ADDITIONAL_CONSUMPTION, tankCapacity);
    }

}

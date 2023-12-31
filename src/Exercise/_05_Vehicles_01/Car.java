package src.Exercise._05_Vehicles_01;

public class Car extends VehicleImpl {

    private final static double AC_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double litersPerKm) {
        super(fuelQuantity, litersPerKm + AC_ADDITIONAL_CONSUMPTION);
    }

}

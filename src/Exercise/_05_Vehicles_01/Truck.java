package src.Exercise._05_Vehicles_01;

import java.text.DecimalFormat;

public class Truck extends Vechicles{
    private final static double AC_ADDITIONAL_CONSUMPTION = 1.6;
    private static final double REFILL_PERCENTAGE = 0.95;
    public Truck(double fuelQuantity, double litersPerKm) {
        super(fuelQuantity, litersPerKm + AC_ADDITIONAL_CONSUMPTION);
    }

    @Override
    void refueling(double litters) {
        super.setFuelQuantity(super.getFuelQuantity() + (litters * REFILL_PERCENTAGE));
    }
}

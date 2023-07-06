package src.Exercise._05_Vehicles_01;

import java.text.DecimalFormat;
import java.util.logging.SocketHandler;

public class Car extends Vechicles{

    private final static double AC_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double litersPerKm) {
        super(fuelQuantity, litersPerKm + AC_ADDITIONAL_CONSUMPTION);
    }

    @Override
    void refueling(double litters) {
        super.setFuelQuantity(super.getFuelQuantity() + litters);
    }
}

package src.Exercise._05_VehiclesExtension_02;

public class Truck extends VehicleImpl {
    private final static double AC_ADDITIONAL_CONSUMPTION = 1.6;
    private static final double REFILL_PERCENTAGE = 0.95;

    public Truck(double fuelQuantity, double litersPerKm) {
        super(fuelQuantity, litersPerKm + AC_ADDITIONAL_CONSUMPTION);
    }

    @Override
    public void refueling(double liters) {              //пренаписваме мотода за зареждане, като включваме ограниченията за пълен резервоар
        super.refueling(liters * REFILL_PERCENTAGE);
    }
}



package src.Exercise._05_Vehicles_01;

import java.text.DecimalFormat;

public abstract class Vechicles {
    private double fuelQuantity;
    private double litersPerKm;

    public Vechicles(double fuelQuantity, double litersPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.litersPerKm = litersPerKm;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getLitersPerKm() {
        return litersPerKm;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setLitersPerKm(double litersPerKm) {
        this.litersPerKm = litersPerKm;
    }

    public void driving(double distance){
        double fuelNeeded = distance * this.getLitersPerKm();

        if (fuelNeeded > this.getFuelQuantity()){
            System.out.printf("%s needs refueling%n", this.getClass().getSimpleName());
        }else{
            this.setFuelQuantity(this.getFuelQuantity() - fuelNeeded);
            DecimalFormat decimalFormat = new DecimalFormat("##.##");
            System.out.printf("%s travelled %s km%n", this.getClass().getSimpleName(),decimalFormat.format(distance));
        }
    }
    abstract void refueling(double litters);

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), getFuelQuantity());
    }
}

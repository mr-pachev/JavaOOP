package vehiclesExtension;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicles {
    private double fuelQuantity;
    private double litersPerKm;
    private double tankCapacity;

    public VehicleImpl(double fuelQuantity, double litersPerKm, double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.litersPerKm = litersPerKm;
        this.tankCapacity = tankCapacity;
    }

    public double getLitersPerKm() {                                //за изчисляването но разхода на гориво в подкласовете
        return litersPerKm;
    }

    public double getFuelQuantity() {                               //трябва ни за принтирането в toString
        return fuelQuantity;
    }

    public void setLitersPerKm(double litersPerKm) {
        this.litersPerKm = litersPerKm;
    }

    public void setFuelQuantity(double fuelQuantity) {          //трябва ни за промяна разхода на гориво
            this.fuelQuantity = fuelQuantity;
    }

    @Override
    public String driving(double distance) {                        //еднакъв метод за добавяне на гориво при всички превозни средства
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        double neededFuel = distance * this.litersPerKm;
        String result = String.format("%s needs refueling", this.getClass().getSimpleName());

        if (neededFuel <= getFuelQuantity()) {
            result = String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat.format(distance));
            this.setFuelQuantity(this.fuelQuantity -= neededFuel);  //намаляваме текущото гориво с изразходваното
        }
        return result;
    }

    @Override
    public void refueling(double liters) {                          //еднакъв метод за добавяне на гориво при всички превозни средства

        if(liters < 1){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        double newFuelQuantity = this.fuelQuantity + liters;
        if (newFuelQuantity > this.tankCapacity){
            throw new  IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.getFuelQuantity());
    }
}

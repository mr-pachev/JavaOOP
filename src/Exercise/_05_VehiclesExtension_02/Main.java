package src.Exercise._05_VehiclesExtension_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VehicleImpl car = creatVechicles(scanner.nextLine().split("\\s+"));
        VehicleImpl truck = creatVechicles(scanner.nextLine().split("\\s+"));

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String[] inputData = scanner.nextLine().split("\\s+");

            String command = inputData[0];
            String typeVehicle = inputData[1];

            runCommand(command, inputData, typeVehicle, car, truck);
        }
        System.out.println(car);
        System.out.println(truck);
    }

    private static void runCommand(String command, String[] inputData, String typeVehicle, VehicleImpl car, VehicleImpl truck) {
        if ("Drive".equals(command)) {
            double distance = Double.parseDouble(inputData[2]);
            if ("Car".equals(typeVehicle)) {
                System.out.println(car.driving(distance));
            } else if ("Truck".equals(typeVehicle)) {
                System.out.println(truck.driving(distance));
            }
        } else if ("Refuel".equals(command)) {
            double liters = Double.parseDouble(inputData[2]);
            if ("Car".equals(typeVehicle)) {
                car.refueling(liters);
            } else if ("Truck".equals(typeVehicle)) {
                truck.refueling(liters);
            }
        }
    }

    public static VehicleImpl creatVechicles(String[] vehicleData) {
        double fuelQuantity = Double.parseDouble(vehicleData[1]);
        double litersPerKm = Double.parseDouble(vehicleData[2]);

        VehicleImpl vechicles = null;
        if ("Car".equals(vehicleData[0])) {
            vechicles = new Car(fuelQuantity, litersPerKm);
        } else if ("Truck".equals(vehicleData[0])) {
            vechicles = new Truck(fuelQuantity, litersPerKm);
        }
        return vechicles;
    }
}

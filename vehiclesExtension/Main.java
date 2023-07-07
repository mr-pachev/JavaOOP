package vehiclesExtension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vehicleData = scanner.nextLine().split("\\s+");
        double fuelQuantity = Double.parseDouble(vehicleData[1]);
        double litersPerKm = Double.parseDouble(vehicleData[2]);
        double tankCapacity = Double.parseDouble(vehicleData[3]);

        Car car = new Car(fuelQuantity, litersPerKm, tankCapacity);

        vehicleData = scanner.nextLine().split("\\s+");
        fuelQuantity = Double.parseDouble(vehicleData[1]);
        litersPerKm = Double.parseDouble(vehicleData[2]);
        tankCapacity = Double.parseDouble(vehicleData[3]);

        Truck truck = new Truck(fuelQuantity, litersPerKm, tankCapacity);

        vehicleData = scanner.nextLine().split("\\s+");
        fuelQuantity = Double.parseDouble(vehicleData[1]);
        litersPerKm = Double.parseDouble(vehicleData[2]);
        tankCapacity = Double.parseDouble(vehicleData[3]);

        Bus bus = new Bus(fuelQuantity, litersPerKm, tankCapacity);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String[] inputData = scanner.nextLine().split("\\s+");

            String command = inputData[0];
            String typeVehicle = inputData[1];

            try {
                if ("Drive".equals(command)) {
                    double distance = Double.parseDouble(inputData[2]);
                    if ("Car".equals(typeVehicle)) {
                        System.out.println(car.driving(distance));
                    } else if ("Truck".equals(typeVehicle)) {
                        System.out.println(truck.driving(distance));
                    } else if ("Bus".equals(typeVehicle)) {
                        if (bus.isEmpty()){
                            bus.setEmpty(false);
                            bus.setLitersPerKm(bus.getLitersPerKm() + 1.4);
                        }
                        System.out.println(bus.driving(distance));
                    }
                } else if ("Refuel".equals(command)) {
                    double liters = Double.parseDouble(inputData[2]);
                    if ("Car".equals(typeVehicle)) {
                        car.refueling(liters);
                    } else if ("Truck".equals(typeVehicle)) {
                        truck.refueling(liters);
                    } else if ("Bus".equals(typeVehicle)) {
                        bus.refueling(liters);
                    }
                } else if ("DriveEmpty".equals(command)) {
                    double distance = Double.parseDouble(inputData[2]);
                    if (!bus.isEmpty()){
                        bus.setEmpty(true);
                        bus.setLitersPerKm(bus.getLitersPerKm() - 1.4);
                    }
                    bus.driving(distance);
                }
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

        }
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }

    private static void runCommand(String command, String[] inputData, String typeVehicle, VehicleImpl car, VehicleImpl truck, VehicleImpl bus) {
        if ("Drive".equals(command)) {
            double distance = Double.parseDouble(inputData[2]);
            if ("Car".equals(typeVehicle)) {
                System.out.println(car.driving(distance));
            } else if ("Truck".equals(typeVehicle)) {
                System.out.println(truck.driving(distance));
            } else if ("Bus".equals(typeVehicle)) {

                System.out.println(truck.driving(distance));
            }
        } else if ("Refuel".equals(command)) {
            double liters = Double.parseDouble(inputData[2]);
            if ("Car".equals(typeVehicle)) {
                car.refueling(liters);
            } else if ("Truck".equals(typeVehicle)) {
                truck.refueling(liters);
            } else if ("Bus".equals(typeVehicle)) {
                truck.refueling(liters);
            }
        } else if ("DriveEmpty".equals(command)) {

        }
    }
}

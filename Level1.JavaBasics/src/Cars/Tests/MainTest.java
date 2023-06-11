package Cars.Tests;

import Cars.Base.*;
import Cars.Models.ElectricCar;
import Cars.Models.VehicleCar;
public class MainTest {
    public static void main(String[] args) {
        var electricCar = new ElectricCar(
                "BMW",
                2.1,
                CarType.COUPE,
                new Engine(220, EngineType.ELECTRIC)
        );

        var vehicleCar = new VehicleCar(
                "Logan",
                1.7,
                CarType.SEDAN,
                new Engine(155, EngineType.VEHICLE)
        );

        testCar(electricCar);
        testCar(vehicleCar);
    }

    public static void testCar(Car car) {
        System.out.println("\n--------------");
        System.out.println(car.toString());

        if (car instanceof Drivable) {
            driveCar((Drivable)car);
        }

        System.out.println("--------------");
    }

    public static void driveCar(Drivable drivable) {
        drivable.drive();
    }
}
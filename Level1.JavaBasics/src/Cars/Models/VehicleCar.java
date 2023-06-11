package Cars.Models;
import Cars.Base.*;

public class VehicleCar extends Car implements Drivable {
    private final Enginable engine;

    public VehicleCar(String brand, double weight, CarType carType, Engine engine) {
        super(brand, weight, carType);
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() + "\n" +
                "Power: " + engine.power + "\n" +
                "CarType: " + getCarType() + "\n" +
                "CarType: " + engine.engineType + "\n" +
                "Weight: " + getWeight();
    }

    @Override
    public void drive() {
        engine.startEngine();
        getWheel().spin();
        engine.stopEngine();
    }
}

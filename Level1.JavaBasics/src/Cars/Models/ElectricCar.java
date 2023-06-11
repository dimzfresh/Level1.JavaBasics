package Cars.Models;
import Cars.Base.*;
public class ElectricCar extends Car implements Drivable {
    private final Enginable engine;
    public ElectricCar(String brand, double weight, CarType carType, Engine engine) {
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
        getWheel().spin();
    }
}
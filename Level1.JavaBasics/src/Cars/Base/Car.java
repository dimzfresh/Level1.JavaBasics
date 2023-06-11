package Cars.Base;

public class Car {
    private String brand;
    private double weight;
    private CarType carType;
    private Wheelable wheel;

    public Car(String brand, double weight, CarType carType) {
        this.brand = brand;
        this.weight = weight;
        this.carType = carType;
        this.wheel = new Wheel();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Wheelable getWheel() {
        return wheel;
    }

    public void setWheel(Wheelable wheel) {
        this.wheel = wheel;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}

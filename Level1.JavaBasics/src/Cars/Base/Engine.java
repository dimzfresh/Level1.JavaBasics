package Cars.Base;

public class Engine implements Enginable {
    protected int power;
    protected EngineType engineType;

    public Engine(int power, EngineType engineType) {
        this.power = power;
        this.engineType = engineType;
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine");
    }
    @Override
    public void stopEngine() {
        System.out.println("Stop engine");
    }
}

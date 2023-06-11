package Cars.Base;
public interface Enginable {
    int power = 0;
    EngineType engineType = EngineType.VEHICLE;
    void startEngine();
    void stopEngine();
}

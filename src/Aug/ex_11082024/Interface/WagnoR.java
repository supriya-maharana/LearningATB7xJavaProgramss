package Aug.ex_11082024.Interface;

public class WagnoR implements IEngine {

    void drive()
    {
        startEngine();
        stopEngine();
    }

    @Override
    public void startEngine() {
        System.out.println("Wagon R i starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Wagon R i Stopping");
    }
}

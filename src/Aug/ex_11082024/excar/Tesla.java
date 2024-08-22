package Aug.ex_11082024.excar;

public class Tesla extends Engine{

    void drive(){
        openCar();
        start();
        PartGearbox();
        stop();
    }

    @Override
    void start() {
        System.out.println("Starting Tesla");
    }

    @Override
    void stop() {
        System.out.println("Stopping Tesla");
    }

    @Override
    void speed() {
        System.out.println("300km.hr");
    }

    @Override
    void PartGearbox() {
        System.out.println("electric");
    }

    @Override
    void openCar() {
        System.out.println("open Tesla");
    }
}

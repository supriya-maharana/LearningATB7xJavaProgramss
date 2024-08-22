package Aug.ex_11082024.Interface.ex3;

public class Lab190 {
    public static void main(String[] args) {
        Car c  = new Car();
        c.start();
        c.m1();
        c.suite();
    }
    }
    interface Eng{
        void start();
        default void m1(){
            System.out.println("Old M1");
        }

        default void suite(){
            System.out.println("wear suite");
        }
    }

    interface GearBox extends Eng{
        void gear();

    }

    interface Keys extends GearBox{
        void openCar();
    }



    class Car implements Keys {

        @Override
        public void start() {
            System.out.println("Starting");
        }

        @Override
        public void gear() {

        }

        @Override
        public void openCar() {

        }
    }


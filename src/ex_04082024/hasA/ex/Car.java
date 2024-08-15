package ex_04082024.hasA.ex;

public class Car {
    // Aggregation - hasA
    public void StartTheCar(){
        new Enginees().start();
        new Tyres().rolling();
    }
}

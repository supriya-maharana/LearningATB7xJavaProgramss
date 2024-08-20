package Aug.ex_10082024.Polymorphism.methodOverriding;

public class Hound extends Dog{
    @Override
    void bark()
    {
        System.out.println("I am Hound, i will bark!!");
    }
    void bike()
    {
        System.out.println("Bike ridding");
    }
}

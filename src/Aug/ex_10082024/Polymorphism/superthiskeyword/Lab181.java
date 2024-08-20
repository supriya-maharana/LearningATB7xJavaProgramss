package Aug.ex_10082024.Polymorphism.superthiskeyword;

public class Lab181 {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.display();
    }
}
class vehicle{
    public int maxspeed=180;
    vehicle()
    {
        System.out.println("dc vehicle");
    }
    vehicle(int a)
    {
        System.out.println("pc vehicle");
    }
    void message()
    {
        System.out.println("Hello vehicle");
    }
    void message(int a)
    {
        System.out.println("Hello vehicle a");
    }

}
class Car extends vehicle
{
    private int maxspeed=200;
    Car()
    {
        super();

        System.out.println("DC car");
    }
    @Override
    void message()
    {
        System.out.println("Hello vehicle");
    }
    void display()
    {
        System.out.println("Car speed is ->" + this.maxspeed);
        System.out.println("Vehicle speed is ->" + super.maxspeed);

        this.message();
        super.message();
    }

}

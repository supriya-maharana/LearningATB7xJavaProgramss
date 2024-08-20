package Aug.ex_10082024.Polymorphism.methodOverloading;

public class MathOperation {

    //Encapsulation
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int add(int a, int b){
        return  a+b;
    }

    //Method Overloading
    double add(double a,double b)
    {
        return a+b;
    }
    void add(String Supriya, int suupi, double silu)
    {
        System.out.println("Hello");

    }
    String add(String suu,String supi)
    {
        return suu + supi;
    }
    double add(double a, double b, float f) {
        return a + b + f;
    }
    MathOperation()
    {}
    MathOperation(int a,int b){}
    MathOperation(int a, int b, int c) {}

    MathOperation(int a, int b, int c, String d) {}



}

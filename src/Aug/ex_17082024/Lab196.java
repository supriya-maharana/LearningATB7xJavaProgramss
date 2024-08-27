package Aug.ex_17082024;

public class Lab196 {
    public static void main(String[] args) {
    Demo obj=new Demo();
        System.out.println(obj.age);
        System.out.println(Demo.discount);
        obj.m2();
        Demo.m1();
    }
}
 class Demo
{
    int age=10;
    static int discount =199;
    static {
        System.out.println("One time load SIB");
    }
    {
        System.out.println("IIB when object is created");
    }
    static void m1()
    {
        System.out.println("m1");
    }
    void m2()
    {
        System.out.println("m2");
        System.out.println(discount);
    }
}

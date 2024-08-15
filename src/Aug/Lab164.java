package Aug;

public class Lab164 {
    int e=87;  //instance variable :-Access within class
    void f1()
    {
        int e=90;  //Local variable :-Access within same method
        System.out.println(e);
    }
    void f2()
    {
        System.out.println(e);
    }
    void f3()
    {
        e=60;
        System.out.println(e);
    }

    public static void main(String[] args) {
        Lab164 obj=new Lab164();
       obj.f1();
       obj.f2();
        obj.f3();
    }
}

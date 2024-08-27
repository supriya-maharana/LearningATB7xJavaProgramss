package Aug.ex_17082024;

import com.sun.security.jgss.GSSUtil;

public class Lab198 {
    public static void main(String[] args) {

    }
}
//Nested class -Rarely  you will be using it
class OuterClass
{
    Integer a=10;
    void outermethod()
    {
        //System.out.println(b); - you can't access inner class member in outer class
        System.out.println("OC method");
    }
    class InnerClass
    {
        Integer b = 20;
        void innermethod()
        {
            System.out.println(a);
            System.out.println(" InC method");
        }
    }
}

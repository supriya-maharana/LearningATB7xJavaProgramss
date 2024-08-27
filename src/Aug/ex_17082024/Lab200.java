package Aug.ex_17082024;

public class Lab200 {
    public static void main(String[] args) {
        IAnonymous obj=new IAnonymous() { ////Anonymous class
            int val=67;
            @Override
            public void method1() {
                System.out.println("m1");
            }

            @Override
            public void method2() {
                System.out.println("m2");
            }
        };
        //Anonymous class
        ABC obj2=new ABC() {
            @Override
            void method3() {
                System.out.println("M3");
            }
        };
    }
}

//Anonymous
interface IAnonymous
        {
             void method1() ;
            void method2();
        }
abstract class ABC
{
    void method3() {

    }
}


package July.ex_07072024.ex_21072024;

public class Lab112 {
    public static void main(String[] args) {
        final boolean b=true;
        // b=false; final this is fixed now

//        for (int i = 0; b; i++) {
//            System.out.println("Hello"); // o/p -infinite value
//        }

//        for (int i = 0; ;) {
//            System.out.println("Hello");     //o/p  -infinite value
//
//        }

//        for (;;) {
//            System.out.println("Hello");     //o/p  -infinite value
//
//       }
        for (float f = 0.0f; f < 10.67; f++) {
            System.out.println("Hello " + f);
        }
        System.out.println("//////////////////////////////////////////////////////////");
        for (byte b1 = 0; b1 <10.67 ; b1++) {
            System.out.println("Hello " + b1);
        }

    }
}

package Aug.ex_17082024;

public class Lab208 {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        String ip=null; //ArrayIndexOutOfBoundsException
        try
        {
            ip=args[0];

        }catch(ArrayIndexOutOfBoundsException ex)
        {
            throw new RuntimeException(ex);
        }
        int a=0;// NumberFormatException
        try
        {
            a=Integer.parseInt(ip);

    } catch (NumberFormatException e) {
        throw new RuntimeException(e);
    }
    int b = 0; // ArithmeticException
        try {
        b = 1000 / a;
    } catch (ArithmeticException e) {
        throw new RuntimeException(e);
    }
        System.out.println(b);
        System.out.println("End of the program");


    }
}

package Aug.ex_17082024;

public class Lab207 {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        int b=0;// ArithmeticException
        try
        {
          String ip=args[0]; //ArrayIndexOutOfBoundsException
            int a=Integer.parseInt(ip); //NumberFormatException
            b=1000/a;

        }catch (ArithmeticException | NumberFormatException |ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println(b);
        System.out.println("End of Program");
    }
}

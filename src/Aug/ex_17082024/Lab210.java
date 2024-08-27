package Aug.ex_17082024;

public class Lab210 {
    public static void main(String[] args) {
        final double pi=68.8;
        int a=0;
        try
        {
            int x=10/a;
        }
        catch (Exception ex)
        {
            System.out.println("div by Zero");
        }finally
        {
            System.out.println("I  will ve execute any how!");
        }
    }
}

package Aug.ex_17082024;

public class Lab211 {
    public static void main(String[] args) {
        try
        {
            int x=10/0;

        }catch (Exception supi)
        {
            //supi.getMessage();
            System.out.println("Div by zero");
        }finally {
            System.out.println("I will execute any how!");
        }
    }
}

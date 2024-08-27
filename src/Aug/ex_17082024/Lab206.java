package Aug.ex_17082024;

public class Lab206 {
    public static void main(String[] args) {
        int c=0;
        try
        {
            c=1000/c;
        }
        catch (Exception ex)
        {
            ex.getMessage();
        }
        System.out.println(c);
        System.out.println("End");


    }
}

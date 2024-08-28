package Aug.ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab216 {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            int a=10/0; //unchecked
        } catch (ArithmeticException | NullPointerException |ArrayIndexOutOfBoundsException e) {
            System.out.println("e1");;
        }catch (Exception ex)
        {
            System.out.println("ex");
        }
        finally {
            System.out.println("FF");
        }
        FileReader file=new FileReader(new File("C://a.txt"));

    }
}

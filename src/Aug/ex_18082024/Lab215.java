package Aug.ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;



//throws :-it will work on whole function
//try-catch-it will work on only block of code
public class Lab215 {
    public static void main(String[] args) throws FileNotFoundException ,ArithmeticException  {
        readFile();
    }

    private static void readFile() throws FileNotFoundException,ArithmeticException {
        System.out.println("Hello Parinita");
        String path = "Downloads/Ad1.mp4";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);



        // read the file txt it can read the file
        System.out.println("End of the program");


    }
}

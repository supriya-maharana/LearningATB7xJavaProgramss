package Aug.ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab214 {
    public static void main(String[] args) {
        String path = "C://a.txt";
        File f=new File(path);
        try {
            FileReader fr=new FileReader(f);
        } catch (Exception e) {
            System.out.println("FNE");
        }
    }
}

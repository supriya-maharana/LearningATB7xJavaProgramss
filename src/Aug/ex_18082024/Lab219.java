package Aug.ex_18082024;

import java.util.Scanner;

public class Lab219 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc1.next();
        if(name.equalsIgnoreCase("Supriya"))
            try {
                    throw new Exception("Not Allowed!");
                }
             catch (Exception e) {
                 System.out.println("Exception");
            }
        else  {
            System.out.println("Allowed");
        }
    }
}

package Aug.ex_18082024;

import java.util.Scanner;

public class Lab218 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try {
            if(a==0)
            {
                throw  new ArithmeticException("Enter non zero number");
            }
            int a2  = 10/a;
            System.out.println(a);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }

    }

}

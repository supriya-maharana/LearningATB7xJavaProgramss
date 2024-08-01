package ex_20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        // Max number between two numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        String str ="Maximum no is ";
       // System.out.println(Math.max(num1,num2));
      if(num1 >num2)
      {
           System.out.println(str +num1);
      }
      else if(num2 >num1){
          System.out.println(str + num2);
       }
      else {
          System.out.println("equal");
      }


    }
}

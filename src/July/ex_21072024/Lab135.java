package July.ex_21072024;

import java.util.Scanner;

public class Lab135 {
    public static void main(String[] args) {
        // For and if

        // FizzBuzz Problem:
        // Write a program that prints numbers from 1 to 100.
        // For multiples of 3, print "Fizz" instead of the number,
        // and for the multiples of 5, print "Buzz".
        // For numbers which are multiples of both 3 and 5,
        // print "FizzBuzz".
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int input=sc.nextInt();
        for (int i = 1; i<input; i++) {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");

            }
             else if(i%3==0)
             {
                 System.out.println("Fizz");
             }
             else if(i%5==0)
             {
                 System.out.println("Buzz");
             }
             else {
                System.out.println(i);
            }
        }
    }
}

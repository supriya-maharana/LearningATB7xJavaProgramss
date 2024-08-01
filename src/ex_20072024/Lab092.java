package ex_20072024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        //switch case
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7, Tell What day it its");
        int Day = sc.nextInt();
        switch (Day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea,what day it's");

        }
        System.out.println("  ---- === Outside the Switch loop === -----");
    }
}

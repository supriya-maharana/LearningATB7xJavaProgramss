package July.ex_07072024.ex_27072014;

import java.util.Scanner;

public class Lab138 {
    public static void main(String[] args) {
        //Array ->New
        int[] marks=new int[3];
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=67;
        marks[2]=90;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
      //         System.out.println(marks[10]); // AIOBE

        boolean Is_married[]={true,false};

        for (int i = 0; i < marks.length; i++) {
            System.out.println(i +" ->" +marks[i]);

        }
        String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday"};
        for (int i = 0; i < weekDays.length; i++) {
            System.out.println(i +"->" +weekDays[i]);
        }
    }
}

package July.ex_07072024.ex_27072014;

import java.util.Scanner;

public class Lab145 {
    public static void main(String[] args) {
        // Where we take the user input of the 5 subjects - Avg of the subject.
        // Figure inputs - float, scanner class

        Scanner sc=new Scanner(System.in);
        float [] marks=new float[5];
//        System.out.println("Enter the marks of the sub 1");
//        marks[0] = sc.nextFloat();
//        System.out.println("Enter the marks of the sub 2");
//        marks[1] = sc.nextFloat();
//        System.out.println("Enter the marks of the sub 3");
//        marks[2] = sc.nextFloat();
//        System.out.println("Enter the marks of the sub 4");
//        marks[3] = sc.nextFloat();
//        System.out.println("Enter the marks of the sub 5");
//        marks[4] = sc.nextFloat();



        // using for Loop through each subject index
        for (int i = 0; i < marks.length; i++) {
            // Print the prompt with the current subject number
            System.out.println("Enter the marks of subject " + (i + 1));
            // Read the marks from the user and store them in the array
            marks[i] = sc.nextFloat();
        }



        // Optional: Print the entered marks to verify
//        System.out.println("Entered marks:");
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
//        }
        float avg=marks[0]+marks[1]+marks[2]+marks[3]+marks[4]/5;
        System.out.println("Avg is ->" + avg);
        //using while Loop
        int j=0;
        while(j<marks.length)
        {
            System.out.println(marks[j]);
            j++;
        }
        sc.close();
    }
}

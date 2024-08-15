package ex_04082024;

import java.util.Scanner;

public class Lab169 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of Bank");
        String name=sc.next();
        System.out.println("Enter Bank balance");
        long bal=sc.nextLong();
        System.out.println("Enter BankCode");
        String Bcode=sc.next();

        BankAccount obj=new BankAccount(name,bal,Bcode);
        obj.Details();
        sc.close();
//        BankAccount obj2=new BankAccount("ICICI",7647866,"ICIC878");
//        obj.Details();
//        obj2.Details();
//        BankAccount obj3=new BankAccount("HDFC");
//        obj3.Details();
//        BankAccount obj4=new BankAccount("IDFC",809908);
//        obj4.Details();
    }
}

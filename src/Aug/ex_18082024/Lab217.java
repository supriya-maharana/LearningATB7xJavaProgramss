package Aug.ex_18082024;

public class Lab217 {
    public static void main(String[] args) {
        //Throw -Custom exception
        Bank sbi=new Bank("INR",100);



        Bank jpmorgan = new Bank("AED", 89);
        Integer totalnew = sbi.add(jpmorgan);
        System.out.println(totalnew);
    }
}



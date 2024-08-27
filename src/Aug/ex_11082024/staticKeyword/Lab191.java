package Aug.ex_11082024.staticKeyword;

import static java.lang.System.out;

public class Lab191 {

    // Static
    // block
    // Data member
    // Function
    // Class
    public static void main(String[] args) {
        ATB a1 = new ATB("amit");
    }
}

class ATB
{

    //System.out.println("IIB"); //Instance installation block
    // What is the purpose? -
    // Here you can write code related to
    // start a website or anything before starting the
    // web automation or api automation
    //
        //System.out.println("Reading from CSV file");

    static {
        System.out.println("Load the class?, I will execute");
    }



    private String name;
    private String phone;
    static String courseName = "ATB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name;
    }

    static void doAssignment(){
        System.out.println("Do Assignment");
    }

    static class A{

    }

}

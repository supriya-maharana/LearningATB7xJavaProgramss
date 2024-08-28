package Aug.ex_18082024.Collection_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class Lab230 {
    public static void main(String[] args) {
        List mylist1 = new ArrayList(5); // FR - CO
        mylist1.add("supi");
        mylist1.add("Anusha");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        System.out.println(mylist1);

        Vector v = new Vector();
        v.add("supi"); // t1
        v.add("Anusha"); // t1
        v.add("Kiran"); // t1
        System.out.println(v);
        // Only Problem with the Vector
        // - It is Thread Safe, Synchronised.
        // It will be time consumming
        // One by One - usage
        // Slower



    }
}

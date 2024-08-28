package Aug.ex_18082024.Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab226 {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        mylist.add("Pravin");
        mylist.add("Anusha");
        mylist.add("Kiran");
        mylist.add("Pravin"); // Duplicate
        mylist.add("Pravin");
        // add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, retainAll, containsAll
        System.out.println(mylist);
        System.out.println(mylist.size());
        mylist.remove("Pravin");
        // Removes the first occurrence of the specified element from this list,
        System.out.println(mylist);
        mylist.clear();
        System.out.println(mylist);
        System.out.println(mylist.isEmpty());

        mylist.add("Pravin");
        mylist.add("Anusha");
        mylist.add("Kiran");
        mylist.add("Pravin"); // Duplicate
        mylist.add("Pravin");

        System.out.println(mylist);
        mylist.add("Dutta");
        System.out.println(mylist);
        mylist.set(1, "AnushaDutta");
        System.out.println(mylist);

        mylist.add(123);
        mylist.add(true);
        System.out.println(mylist);

        System.out.println("    - - - --  " );

        // hOw to print?
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

        System.out.println("    - - - --  " );


        // Enhanced For loop
        for (Object o: mylist){
            System.out.println(o);
        }






    }
    }


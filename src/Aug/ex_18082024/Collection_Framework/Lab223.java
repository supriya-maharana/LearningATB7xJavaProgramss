package Aug.ex_18082024.Collection_Framework;

import java.util.ArrayList;

public class Lab223 {
    public static void main(String[] args) {
        // Collections Framework
        // Collection - Interface
        // Collection(I) -> List (I)
        // List (I) -> ArrayList, LinkedList, Vector, Stack

        // Shopping List, Marks List, Collection of items, Todo List, Student List.
//        Collection mylist3 = new ArrayList(); //  Dynamic Dispatch
//        List mylist = new ArrayList(); //  Dynamic Dispatch
//

        ArrayList arr=new ArrayList();
        arr.add("supi");
        arr.add("Amit");
        arr.add("lucky");
        arr.add("Muthu");
        arr.add(123);
        arr.add(true);
        System.out.println(arr);
        System.out.println(arr.get(3));
        System.out.println(arr.size());
        System.out.println(arr.remove(2));
        System.out.println(arr.contains("Amit"));
        String s1=(String)arr.get(2);
        System.out.println(s1);
    }
}

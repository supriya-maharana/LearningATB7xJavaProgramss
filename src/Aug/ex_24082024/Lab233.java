package Aug.ex_24082024;

import java.util.ArrayList;
import java.util.Collections;

public class Lab233 {
    public static void main(String[] args) {
        ArrayList marks=new ArrayList();
        {
            marks.add(39);
            marks.add(67);
            marks.add(90);
            marks.add(74);
            marks.add(10);
        }
        Collections.sort(marks);//u can sort by using collections when you have same type value.
        System.out.println(marks);

        ArrayList name=new ArrayList();
        {
            name.add("Pravin");
            name.add("SHivangi");
            name.add("Muthu");
            name.add("Parimal");
            name.add("Supriya");

        }
        Collections.sort(name);
        System.out.println(name);
    }
}

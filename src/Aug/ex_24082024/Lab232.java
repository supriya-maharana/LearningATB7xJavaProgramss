package Aug.ex_24082024;

import java.util.Stack;

public class Lab232 {
    public static void main(String[] args) {
        Stack s=new Stack<>();
        {
            s.add("silajit");
            s.add("saransh");
            s.push("Sarat");
            s.push("Amit");
            s.add("AMit2");


        }
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
    }
}

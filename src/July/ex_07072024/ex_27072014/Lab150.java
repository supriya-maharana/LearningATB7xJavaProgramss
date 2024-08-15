package July.ex_07072024.ex_27072014;

public class Lab150 {
    public static void main(String[] args) {
        // String - Bunch of Chars /collection of char.
        //
        String s1 = new String("supi"); // Heap Area
        String s2 = "supi"; // String constant pool

        // String - Immutable in nature.
        System.out.println(s1.length());
        System.out.println(s1.indexOf("p"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
    }
}

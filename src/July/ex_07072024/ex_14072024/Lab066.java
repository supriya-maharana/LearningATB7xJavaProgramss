package July.ex_07072024.ex_14072024;

public class Lab066 {
    public static void main(String[] args) {
        String name = "supi";
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("supi");
        // How many ways we can a String - 2
        // = , new operator
        // = "SCP" // Sting constant Pool
        // new - Objects(heap)

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(10)); // Exception Index 10 out of bounds
    }
}

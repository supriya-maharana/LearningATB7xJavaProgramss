package July.ex_07072024.ex_14072024;

public class Lab074 {
    public static void main(String[] args) {
        String s1 = new String("supi");
        String s2 = new String("supi");
        String s3 = new String("supi");


        System.out.println(s1 == s2); // Check for the ref
        System.out.println(s2 == s3); // Check for the ref
        System.out.println(s2.equals(s3)); // Check for the Content

    }
}

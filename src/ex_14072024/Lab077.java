package ex_14072024;

public class Lab077 {
    public static void main(String[] args) {
        String password  = "supi@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        // pass_u == password
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
        //supi@123 =  supi@123  = supi@123 = supi@123

        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf('r'));
        System.out.println(password.length());
    }
}

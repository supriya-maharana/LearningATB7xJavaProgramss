package Aug.ex_10082024.encapsulation;

public class Lab178 {
    public static void main(String[] args) {
        ICICIBank supi=new ICICIBank("Supriya",675764);
        // set the balance
        // admin

        // amit.name = "dasdd";
        supi.setBal(1000000000,false);
        //amit.setBal();
        System.out.println(supi.getUsername());


        System.out.println(supi.getBal(false));



        // Write a code to connect with mySQL
        //  Admin
        boolean are_you_admin = true;


        ICICIBank admin = new ICICIBank("admin",1000);
        admin.setBal(50000,true);
        System.out.println(admin.getUsername());
        System.out.println(admin.getBal(are_you_admin));

    }


}

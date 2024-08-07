package ex_27072014;

public class Lab140 {
    public static void main(String[] args) {
        //click on current file dropdown select edit configuration,click on application
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);

        if(args.length>0)
        {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);

            }
        }
        else {
            System.out.println("No Arguments given");
        }
    }
}

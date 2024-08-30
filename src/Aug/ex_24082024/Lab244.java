package Aug.ex_24082024;

public class Lab244 {
    public static void main(String[] args) {
        temp("Supriya");
        temp(123);
        temp(true);

        sum(3,4);
        sum("Supriya","M");

        // T - Ref to the Data Type that you want to use.

    }

    public static <Supriya> Supriya sum(Supriya a, Supriya b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

    public static <M> void temp(M name) {
        System.out.println(name);
    }
    }


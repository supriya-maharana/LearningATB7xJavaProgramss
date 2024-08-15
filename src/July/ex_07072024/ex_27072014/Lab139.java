package July.ex_07072024.ex_27072014;

public class Lab139 {
    public static void main(String[] args) {
        int[]num={10,39,45,65,34};
        for (int i = 0; i < num.length ; i++) {
            System.out.println(num[i]*2);
        }
        for (int J = 0; J < num.length; J++) {
            System.out.println(num[J]+3);
        }

        // len -> 5
        // index -> 0, 1,2,3,4
        //  // i = 0,1,2,3,4
        // i = 0   10*2 ->   20
        // i = 1   39*2 ->   78
        // i = 2   65*2 ->   90
        // i = 3   34*2 ->   130

        // 20,78,90,130
    }
}

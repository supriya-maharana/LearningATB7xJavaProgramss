package July.ex_07072024.ex_27072014;

public class Lab148 {
    public static void main(String[] args) {
        int [] [] array_2d={
                {34,12,45},
                {67,78,89},
                {34,79,89}
        };
        // R - 3 - i -> 0 to 2
        // C - 3  j -> 0 to 2
        for (int i = 0; i < array_2d.length ; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

        // i = 0, j ->  0,1,2
        // i = 1 , j -> 0, 1,2
        // i = 2 , j -> 0, 1,2

    }
}

package ex_27072014;

public class Lab149 {
    public static void main(String[] args) {
     int[][] array={
            {67,89},
            {63,28},
            {43,29}
        };
int row = array.length;
        for (int i = 0; i < row; i++) { // Row  0,1
        for (int j = 0; j < array[i].length; j++) { // Column , 0,1,2
        System.out.print(array[i][j]);
                System.out.print("\t");
            }
                    System.out.println("");
        }
    }

}

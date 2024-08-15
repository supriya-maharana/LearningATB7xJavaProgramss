package July.ex_27072014;

public class Lab146 {
    public static void main(String[] args) {
        // Find the Max in the Arrays
        // Find the Max Salary, Min  in the Salary Array
        int[] salary={56,78,87,43,82,98};
        int max=salary[0];
        int min=salary[0];
        for (int i = 0; i < salary.length; i++) {
            if(salary[i]>max)
            {
                max=salary[i];

            }
      if(min>salary[i])
      {
          min=salary[i];
      }
        }
        System.out.println(max);
        System.out.println(min);


        //Using array sort

//        Arrays.sort(salary);
//        System.out.println(salary[salary.length-1]);

    }
}

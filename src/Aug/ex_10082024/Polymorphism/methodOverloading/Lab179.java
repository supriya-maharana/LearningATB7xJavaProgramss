package Aug.ex_10082024.Polymorphism.methodOverloading;

public class Lab179 {
    public static void main(String[] args) {
        MathOperation obj=new MathOperation();
        int result=obj.add(35,78);
        System.out.println(result);
        double result1=obj.add(68.7,34.09);
        System.out.println(result1);
        obj.add("syi",87,87.9);
        //System.out.println(reslt3);

    }
}

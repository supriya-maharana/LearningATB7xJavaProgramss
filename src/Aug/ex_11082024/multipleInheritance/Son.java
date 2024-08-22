package Aug.ex_11082024.multipleInheritance;

public class Son implements IMother,IFather{
    @Override
    public void home() {

    }

    @Override
    public void loan() {
        System.out.println("This is only One Function");
    }

    @Override
    public void loan(String b, String c) {
        System.out.println("String b, String c");
    }

    @Override
    public void loan(String a) {
        System.out.println("String a");
    }
}

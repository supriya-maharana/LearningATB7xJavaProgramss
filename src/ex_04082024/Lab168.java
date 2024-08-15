package ex_04082024;

public class Lab168 {
    public static void main(String[] args) {
        ATBPerson obj=new ATBPerson();
        ATBPerson obj2=new ATBPerson("Supriya",789506588);
        ATBPerson obj3=new ATBPerson("supi");
        ATBPerson obj4=new ATBPerson("Amit");

        System.out.println(obj.name);
        System.out.println(obj2.name);

        System.out.println(obj2.phone);
        System.out.println(obj3.name + " " +obj2.phone);
        System.out.println(obj4.name);
    }
}

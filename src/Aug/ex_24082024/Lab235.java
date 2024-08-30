package Aug.ex_24082024;

import July.ex_28072024.Person;

public class Lab235 {
    public static void main(String[] args) {
        person p1=new person("Supi","Uk");
        person p2=new person("Kushal","US");
        System.out.println(p1);
        System.out.println(p2);
    }
}
class person extends Object
{
    private  String Name;
    private  String Address;

    public person(String name, String address) {
        Name = name;
        Address = address;
    }

    @Override
    public String toString() {
        return " Name ->" + Name + " ,Address ->"+ Address;
    }
}

package Aug.ex_10082024.Polymorphism.superthiskeyword;

public class Lab182 {
    public static void main(String[] args) {
        student s1=new student();
        s1.display();
    }
}
class person
{
    void message()
    {
        System.out.println("I am  person message");
    }
}
class student extends person
{
    // is A relation - inheritance
    @Override
    void message()
    {
        System.out.println("I am student message");
    }
    void display()
    {
        super.message();
        this.message();
    }
}

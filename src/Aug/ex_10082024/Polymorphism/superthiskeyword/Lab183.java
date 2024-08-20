package Aug.ex_10082024.Polymorphism.superthiskeyword;

public class Lab183 {
    // super.variable
    // super.method()
    // super() -> DC
    // super("pramod') -> PC

    // this()
    // this.variableName

}
class person1
{
    person1()
    {
        System.out.println("Person1 - DC");
    }
    person1(int a)
    {
        System.out.println("Person2 - PC");
    }
    person1(String a,int b)
    {
        System.out.println("Person3 - PC");
    }
}
class student1 extends person1
{
    int a=10;
    student1(String s)
    {
        System.out.println("PC -student");
    }
        student1()
        {
            super();
            System.out.println(this.a);
            //super(55);
            //super("supi",12);
        }
}

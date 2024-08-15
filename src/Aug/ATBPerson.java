package Aug;

public class ATBPerson {
    String name;
    long phone;

    public ATBPerson() {
        System.out.println("Object is created");
    }
    public ATBPerson(String nameGiven,long Number)
    {
        this.name=nameGiven;
        this.phone=Number;
    }
    public ATBPerson(String nameGiven)
    {
        this.name=nameGiven;
        // This current class member.
    }
}


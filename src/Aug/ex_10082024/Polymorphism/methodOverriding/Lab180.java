package Aug.ex_10082024.Polymorphism.methodOverriding;

public class Lab180 {

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.bark();

        Hound h1=new Hound();
        h1.bark();  //It will be call child class method only
        h1.bike();

        Dog h2=new Hound();
        h2.bark(); //here it will create child class object and it will call child class method
        //you can access those method which is common in  parent and child class
        //dog_Ref.bike();

        //Hound h2 = new Dog();

    }
}

package Aug.ex_10082024.encapsulation;

public class Lab176 {
    public static void main(String[] args) {
        Vwologin obj=new Vwologin("Admin","Password123");
        System.out.println(obj.Username);
        System.out.println(obj.Password);
        obj.Password = "123";
        System.out.println(obj.Password);

    }

}
class Vwologin{
    public String Username;
    public String Password;

    public Vwologin(String userName, String passWord) {
       this.Username = userName;
        this.Password = passWord;
    }
}

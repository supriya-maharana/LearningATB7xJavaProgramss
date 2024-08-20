package Aug.ex_10082024.encapsulation;

public class Lab177 {
    public static void main(String[] args) {
        Vwologin1 obj=new Vwologin1("Admin","Password123");
        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());
        obj.setUsername("supriya");
        System.out.println(obj.getUsername());
        obj.setPassword("Supriya",true);
//        obj.Password = "123";
//        System.out.println(obj.Password);

    }

}
class Vwologin1{
    private String Username;
    private String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password,boolean Isauth) {
        if(Isauth)
        {
            Password = password;
        }
        else {
            System.out.println("Not Allowed");
        }

    }



    public Vwologin1(String userName, String passWord) {
       this.Username = userName;
        this.Password = passWord;
    }
}

package Aug.ex_10082024;

public class Realtime_Inheritance {
    public static void main(String[] args) {
        BaseClass t1 = new TestCase1(); // Dynamic Dispatch // Runtime
        //t1.setBrowser("opera",true);
        t1.openBrowser();
        t1.closeBrowser();

    }
}
class TestCase1 extends BaseClass{
    // TestCase is A Type of BaseCalss - Single Inheritance
    TestCase1(){
        super(); // DC of Parent
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}
class BaseClass
{
    private String browser;
    BaseClass(){
        System.out.println("DC");
    }

    public BaseClass(String b) {
        System.out.println("CC - BaseClass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }


    void openBrowser() {
        System.out.println("Chrome Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }
    void closeBrowser() {
        System.out.println("Close Browser!!");
    }
}

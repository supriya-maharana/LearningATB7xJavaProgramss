package ex_04082024.SingleInheritance.RealTime;

public class TestCase2 extends BaseTest{
    void testCase2(){
        StartBrowser();// BaseTest
        getDataFromsql(); // GrandBaseTest
        System.out.println(gold); // GrandBaseTest
        // Here we will write the TC
        CloseBrowser();
    }

    public static void main(String[] args) {
        new TestCase2().testCase2();
    }
}

package Aug.ex_11082024.excar.RealLifeex;

abstract class Baseclass extends GrandBaseclass {
    // Web Automation
    // Single
    // Hide the Functionality of the open and close Browser.

    abstract String openBrowser(String browser);
    abstract String closeBrowser(String browser);
    Baseclass(){};
    @Override
    void takeScreenShot() {
        System.out.println("Ok Taking ScreenShot");
    }
}

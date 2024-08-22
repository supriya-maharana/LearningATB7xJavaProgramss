package Aug.ex_11082024.excar.RealLifeex;

public class Chrome extends Baseclass{
    @Override
    String openBrowser(String browser) {
        System.out.println("Open the Chrome .....,         // This is code releted to chrome only\n");
        return browser;
    }

    @Override
    String closeBrowser(String browser) {
        return "";
    }
}

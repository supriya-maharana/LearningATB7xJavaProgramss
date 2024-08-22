package Aug.ex_11082024.excar.RealLifeex;

public class Firefox extends Baseclass{
    @Override
    String openBrowser(String browser) {
        System.out.println("Open the FIREFOX .....,         // This is code releted to FIREFOX only\n");
        return browser;
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Closing the FIREFOX .....,         // This is code releted to FIREFOX only\n");
        return "";
    }


}

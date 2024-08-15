package July.ex_07072024.ex_27072014;

public class Lab151 {
    public static void main(String[] args) {
        // Strings - imutable in nature
        // StringBuilder , StringBuffer
        String s1 = "supi";
        s1 = "maharana";

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        // change the value of string - Buffer
        stringBuffer.append("maharana"); //supriyamaharana
        stringBuffer.append("JI"); //supriyamaharana

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");

        // Thead Safty?

        // stringBuilder - not thread safe - people LOVE it :)


    }
}

package Aug.ex_18082024;

public class Lab220 {
    public static void main(String[] args) {
        try
        {
            String name=null;
            if(name==null)
            {
                throw new Exception("Add a proper String or not null String");
            }
            name.trim();

        } catch(Exception ex)
        {
            throw new RuntimeException(ex);
        }
    }
}

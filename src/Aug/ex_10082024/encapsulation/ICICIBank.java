package Aug.ex_10082024.encapsulation;

public class ICICIBank {

    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.


    private String Username;
    private long Bal;

    public ICICIBank(String username, long bal) {
        this.Username = username;
        this.Bal = bal;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username ,boolean IsAdmin) {
        if(IsAdmin) {
            this.Username = username;
            System.out.println("Allowed");
        }
        else {
            System.out.println("Not Allowed!");
        }
    }

    public long getBal(boolean isAdmin) {
        if (isAdmin) {
            return Bal;
        } else {
            return 0;
        }
    }

    public void setBal(long bal,boolean IsAdmin) {
        if(IsAdmin)
        {
        this.Bal = bal;
            System.out.println("Allowed");
        }
        else {
            System.out.println(" Not Allowed");
        }
    }


    }


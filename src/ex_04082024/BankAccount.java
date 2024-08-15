package ex_04082024;

public class BankAccount {
    String bankName;
    long balance;
    String bankCode; // Instance

    BankAccount()
    {
        bankName="SBI";
        balance=676745698;
        bankCode="SBI00011";
    }

    public BankAccount(String BankName, long Balance, String BankCode) {
        this.bankName = BankName;
        this.balance = Balance;
        this.bankCode = BankCode;
    }

    public BankAccount(String BankName) {
        this.bankName = BankName;
    }

    public BankAccount(String BankName,int Balance) {
        this.bankName = BankName;
        this.balance = Balance;

    }

    void Details()
    {
        System.out.println("Bank Name "+ bankName);
        System.out.println("Balance "+balance);
        System.out.println("BankCode "+bankCode);
    }
}

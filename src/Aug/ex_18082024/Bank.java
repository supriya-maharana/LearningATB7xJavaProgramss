package Aug.ex_18082024;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
       this.currency = currency;
        this.amount = amount;
    }

    public String getcurrency() {
        return currency;
    }

    public void setcurrency(String currency) {
        currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        amount = amount;
    }
    public Integer add(Bank bankName){
        if(!bankName.currency.equalsIgnoreCase("INR")){
            // throw exception that it is not supported - USD, gBP + INR
            try {
                throw new Exception("Currency Doesn't Match!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
        Integer sum = this.amount + bankName.amount;
        return sum;
    }

}

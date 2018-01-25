package lab2.Banking;

/**
 * Created by uruckcharti on 25/1/2018 AD.
 */
class Account {
    /**
     * Class with 4 attribute
     */
    private String accountName;
    private String accountNumber;
    private String branch;
    private double amount;

    public Account() {
    }

    /**
     *
     * @param accountName
     * @param accountNumber
     * @param branch
     * @param amount
     */
    public Account(String accountName, String accountNumber, String branch, double amount) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.branch = branch;
        this.amount = amount;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    // END OF ATTRIBUTE OPERATOR
    void deposit(double amount){
        this.amount += amount;
    }
    void printBalance(){
        System.out.println("Your balance is "+getAmount());
    }
}

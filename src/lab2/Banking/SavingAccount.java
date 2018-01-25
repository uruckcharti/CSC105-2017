package lab2.Banking;

/**
 * Created by uruckcharti on 25/1/2018 AD.
 */
class SavingAccount extends Account {
    SavingAccount(String accountName, String accountNumber, String branch, double amount) {
        super(accountName, accountNumber, branch, amount);
    }

    void withdraw(double amount){
        if(getAmount()<=0){
            System.out.println("Sorry not enough balance in your account!!");
        }
        setAmount(getAmount()-amount);
    }
}

package lab2.Banking;

/**
 * Created by uruckcharti on 25/1/2018 AD.
 */
public class CreditAccount extends Account {
    CreditAccount(String accountName, String accountNumber, String branch, double amount) {
        super(accountName, accountNumber, branch, amount);
    }

    void withdraw(double withdraw){
        setAmount(getAmount()-withdraw);
    }
}

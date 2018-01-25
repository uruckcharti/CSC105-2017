package lab2.Banking;

/**
 * Created by uruckcharti on 25/1/2018 AD.
 */
public class Banking {
    public static void main(String[] args) {
        SavingAccount ukrit = new SavingAccount("Ukrit Ruckcharti","6072624123","Chula",10000);
        System.out.println("account name: "+ukrit.getAccountName());
        System.out.println("inittial amount: "+ukrit.getAmount());
    }

}

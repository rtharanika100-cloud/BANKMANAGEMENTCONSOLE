import java.util.ArrayList;
public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();
public void createAccount(int id, String name, double balance) {
    for (Account acc : accounts) {
        if (acc.getAccountId() == id) {
            System.out.println("Duplicate Account ID not allowed");
            return;
        }
    }
    Account newAcc = new Account(id, name, balance);
    accounts.add(newAcc);
    System.out.println("Account created successfully");
}

//deposit
public void deposit(int id, double amount) {

    for (Account acc : accounts) {
        if (acc.getAccountId() == id) {

            double newBalance = acc.getBalance() + amount;

            System.out.println("Amount deposited successfully");
            System.out.println("New Balance: " + newBalance);

            return;
        }
    }

    System.out.println("Account not found");
}
}

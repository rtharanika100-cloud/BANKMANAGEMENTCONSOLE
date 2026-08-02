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
public void deposit(int id, double amount) {

    for (Account acc : accounts) {
        if (acc.getAccountId() == id) {

            double newBalance = acc.getBalance() + amount;
            acc.setBalance(newBalance);   

            System.out.println("Amount deposited successfully");
            System.out.println("New Balance: " + newBalance);

            return;
        }
    }
    System.out.println("Account not found");
}
public void withdraw(int id, double amount) {

    for (Account acc : accounts) {
        if (acc.getAccountId() == id) {

            if (acc.getBalance() < amount) {
                System.out.println("Insufficient balance");
                return;
            }

            double newBalance = acc.getBalance() - amount;
            acc.setBalance(newBalance);   

            System.out.println("Withdrawal successful");
            System.out.println("Remaining Balance: " + newBalance);

            return;
        }
    }
    System.out.println("Account not found");
}
public void checkBalance(int id) {

    for (Account acc : accounts) {
        if (acc.getAccountId() == id) {
            System.out.println("Balance: " + acc.getBalance());
            return;
        }
    }
    System.out.println("Account not found");
}
}

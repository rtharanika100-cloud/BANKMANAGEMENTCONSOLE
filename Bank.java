import java.util.HashMap;

public class Bank {

    HashMap<Integer, Account> accounts = new HashMap<>();

    public void createAccount(int id, String name, double balance) {

        if (accounts.containsKey(id)) {
            System.out.println("Account already exists!");
            return;
        }

        Account acc = new Account(id, name, balance);
        accounts.put(id, acc);

        System.out.println("Account created successfully");
    }
}
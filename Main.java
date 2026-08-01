import java.util.*;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        // Create Account
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        bank.createAccount(id, name, balance);

        // Deposit
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        bank.deposit(id, amount);
        sc.close();
    }

}
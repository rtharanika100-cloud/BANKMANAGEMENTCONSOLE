import java.util.*;
public class Main {
        public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Balance: ");
                    double balance = sc.nextDouble();
                    bank.createAccount(id, name, balance);
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double damt = sc.nextDouble();
                    bank.deposit(did, damt);
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    int wid = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double wamt = sc.nextDouble();
                    bank.withdraw(wid, wamt);
                    break;
                case 4:
                    System.out.print("Enter ID: ");
                    int cid = sc.nextInt();
                    bank.checkBalance(cid);
                    break;
                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
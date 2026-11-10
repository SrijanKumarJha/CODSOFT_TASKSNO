
import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private Scanner sc;

    // Constructor
    public ATM(BankAccount account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    // Display ATM menu
    public void showMenu() {

        int choice=0;

        do {
            System.out.println("\n================================");
            System.out.println("          ATM INTERFACE");
            System.out.println("================================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid choice!");
                sc.next();
                continue;
            }

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: Rs. ");

                    if (sc.hasNextDouble()) {
                        double depositAmount = sc.nextDouble();
                        deposit(depositAmount);
                    } else {
                        System.out.println("Invalid amount!");
                        sc.next();
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: Rs. ");

                    if (sc.hasNextDouble()) {
                        double withdrawAmount = sc.nextDouble();
                        withdraw(withdrawAmount);
                    } else {
                        System.out.println("Invalid amount!");
                        sc.next();
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);
    }

    // Check balance
    public void checkBalance() {
        System.out.printf("Current Balance: Rs. %.2f%n",
                account.getBalance());
    }

    // Deposit
    public void deposit(double amount) {
        account.deposit(amount);
        checkBalance();
    }

    // Withdraw
    public void withdraw(double amount) {
        account.withdraw(amount);
        checkBalance();
    }
}

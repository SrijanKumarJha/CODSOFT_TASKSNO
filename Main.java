
public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the ATM Machine!");

        // Create bank account with initial balance
        BankAccount account = new BankAccount(5000);

        // Create ATM object
        ATM atm = new ATM(account);

        // Start ATM application
        atm.showMenu();
    }
}

package Keywords;

class BankAccount {
    // Static variable
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    // Final variable (cannot be changed once assigned)
    final int accountNumber;
    String accountHolderName;
    double balance;

    // Constructor using "this" keyword
    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; // final variable set here
        this.balance = balance;
        totalAccounts++;
    }

    // Static method
    static void getTotalAccounts() {
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }

    // Method to display account details with instanceof check
    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Raghav", 1001, 50000);
        BankAccount acc2 = new BankAccount("Aarav", 1002, 75000);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();

        System.out.println();
        BankAccount.getTotalAccounts();
    }
}


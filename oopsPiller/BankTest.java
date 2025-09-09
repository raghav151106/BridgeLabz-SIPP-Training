package oopsPiller;

import java.util.*;

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (balance >= amount) balance -= amount; }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int num, String name, double bal) { super(num, name, bal); }

    @Override
    public double calculateInterest() { return getBalance() * 0.04; }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int num, String name, double bal) { super(num, name, bal); }

    @Override
    public double calculateInterest() { return getBalance() * 0.02; }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 20000;
    }
}

class BankTest {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(301, "Raghav", 10000));
        accounts.add(new CurrentAccount(302, "Aarav", 50000));

        for (BankAccount acc : accounts) {
            System.out.println(acc.getHolderName() + " | Balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());

            if (acc instanceof Loanable) {
                System.out.println("Loan Eligible: " + ((Loanable) acc).calculateLoanEligibility());
            }
            System.out.println("------");
        }
    }
}


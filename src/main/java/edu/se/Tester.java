package edu.se;

public class Tester {
    public static void main(String[] args){
        Account account1 = new Account("Checking", "John Doe", 1000.0);
        Account account2 = new Account("Savings", "Jane Smith", 5000.0);

        System.out.println("Account 1:");
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Type: " + account1.getType());
        System.out.println("Account Holder Name: " + account1.getAccountHolderName());
        System.out.println("Balance: $" + account1.getBalance());

        System.out.println();

        System.out.println("Account 2:");
        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Type: " + account2.getType());
        System.out.println("Account Holder Name: " + account2.getAccountHolderName());
        System.out.println("Balance: $" + account2.getBalance());
    }
}

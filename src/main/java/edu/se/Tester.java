package edu.se;

public class Tester {
    public static void main(String[] args) {
        AccountService service = new AccountService();

        Account acc1 = service.createAccount("Checking", "John Doe", 1000.0);
        Account acc2 = service.createAccount("Savings", "Jane Smith", 5000.0);

        System.out.println("=== Created Accounts ===");
        System.out.println("Account 1: ID=" + acc1.getAccountNumber() + " | Name=" + acc1.getAccountHolderName() + " | Balance=$" + acc1.getBalance());
        System.out.println("Account 2: ID=" + acc2.getAccountNumber() + " | Name=" + acc2.getAccountHolderName() + " | Balance=$" + acc2.getBalance());

        System.out.println("\n=== Updating Account 1 ===");
        service.updateAccount(acc1.getAccountNumber(), "Johnathan Doe", 1500.0);
        System.out.println("Updated Account 1: Name=" + acc1.getAccountHolderName() + " | Balance=$" + acc1.getBalance());

        System.out.println("\n=== Deleting Account 2 ===");
        service.deleteAccount(acc2.getAccountNumber());
        System.out.println("Account 2 lookup after deletion: " + service.getAccount(acc2.getAccountNumber()));
    }
}

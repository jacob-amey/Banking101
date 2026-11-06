package edu.se;
import java.util.UUID;
public class Account {
    private String accountNumber;
    private String type;
    private String accountHolderName;
    private double balance;

    public Account(String type, String accountHolderName, double balance) {
        this.accountNumber = getAccountNumber();
        this.type = type;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        String id = UUID.randomUUID().toString().replace("-", "").substring(0, 16);
        return id;
    }
    public String getType() {
        return type;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

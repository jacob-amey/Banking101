package edu.se;

import java.util.concurrent.ThreadLocalRandom;

public class Account {
    private final String accountNumber;
    private String type;
    private String accountHolderName;
    private double balance;

    public Account(String type, String accountHolderName, double balance) {
        this.accountNumber = generate16DigitNumber();
        this.type = type;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    private String generate16DigitNumber() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThreadLocalRandom.current().nextInt(1, 10));
        for (int i = 0; i < 15; i++) {
            sb.append(ThreadLocalRandom.current().nextInt(0, 10));
        }
        return sb.toString();
    }

    public String getAccountNumber() {
        return accountNumber;
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
//
//
//
//
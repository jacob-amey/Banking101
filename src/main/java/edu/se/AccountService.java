package edu.se;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
    private final Map<String, Account> accounts = new HashMap<>();

    public Account createAccount(String type, String name, double balance) {
        Account account = new Account(type, name, balance);
        accounts.put(account.getAccountNumber(), account);
        return account;
    }

    public void updateAccount(String accountNumber, String name, double balance) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.setAccountHolderName(name);
            account.setBalance(balance);
        }
    }

    public void deleteAccount(String accountNumber) {
        accounts.remove(accountNumber);
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}

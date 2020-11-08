package main;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Singleton
public class Database {
    private final Map<String, Account> accounts = new HashMap<>();

    @Inject
    Database() {
        System.out.println("Creating a new " + this);
    }

    public Account getAccount(String username) {
        return accounts.computeIfAbsent(username, Account::new);
    }

    public static final class Account {
        private final String username;
        private BigDecimal balance = BigDecimal.ZERO;

        public Account(String username) {
            this.username = username;
        }

        public String username() {
            return username;
        }

        public BigDecimal balance() {
            return balance;
        }

        public void deposit(BigDecimal balance) {
            this.balance = balance;
        }
    }
}
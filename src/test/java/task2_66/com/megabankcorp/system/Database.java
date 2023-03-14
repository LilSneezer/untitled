package task2_66.com.megabankcorp.system;

import java.math.BigDecimal;

import task2_66.com.megabankcorp.records.Account;

public abstract class Database {

    public abstract void deposit(BigDecimal amount, Account accountNumber);

    public abstract void withdraw(BigDecimal withdrawalAmount, Account accountNumber);

    protected abstract Account getAmount(Account accountNumber);

    void transfer(Account currentAccountNumber, BigDecimal transferAmount, Account transferAccountNumber) {
        withdraw(transferAmount, currentAccountNumber);
        deposit(transferAmount, transferAccountNumber);
    }
}

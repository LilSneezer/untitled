package task2_66.com.megabankcorp.records;

import java.math.BigDecimal;

public class Account {
    private BigDecimal currentAccountAmount;
    private long accountNumber;
    private int clientId;

    public BigDecimal getCurrentAccountSum() {
        return currentAccountAmount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getClientId() {
        return clientId;
    }

    public void setCurrentAccountSum(BigDecimal currentAccountSum) {
        this.currentAccountAmount = currentAccountSum;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}

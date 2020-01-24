

public class Checking extends BankAccount {
    private double OverdraftAmount;

    Checking(int accountNumber, double balance) {
        super(accountNumber, balance);

    }

    Checking(int accountNumber, double balance, double OverdraftAmount) {
        super(accountNumber, balance);
        this.OverdraftAmount = OverdraftAmount;
    }

    public double getOverdraftAmount() {
        return OverdraftAmount;
    }

    public void addTransaction(Transaction transactions) {
        double balance = super.getBalance();
        double amount = transactions.getAmount();
        if (amount > 0) {
            if (OverdraftAmount == 0) {
                if (OverdraftAmount > amount) {
                    OverdraftAmount = OverdraftAmount - amount;
                    OverdraftAmount = 0;
                    amount = 0;
                } else {
                    amount = amount - OverdraftAmount;
                    OverdraftAmount = 0;
                    balance += amount;
                }
            } else {
                balance += amount - OverdraftAmount;
                OverdraftAmount = 0;
            }
        } else {
            amount *= -1;
            if (balance > 0) {
                if (balance > amount) {
                    balance = balance - amount;
                } else {
                    amount = amount - balance;
                    balance = 0;
                    OverdraftAmount += amount;
                }
            }
        }
        super.setBalance(balance);
    }
}
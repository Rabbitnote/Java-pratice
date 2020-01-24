public class BankAccount {
    private int accountnumber;
    private double balance;
    private Transaction[] transactions;
    private int nowTransaction;

    BankAccount(int accountnumber, double balance) {
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.transactions = new Transaction[100];
    }

    public int getAccountNumber() {
        return accountnumber;
    }

    public void setAccountNumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Transaction[] getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction[] transaction) {
        this.transaction = transaction;
    }

    public int getNowTransaction() {
        return nowTransaction;
    }

    public void setNowTransaction(int nowTransaction) {
        this.nowTransaction = nowTransaction;
    }

    public void addTransaction(Transaction transaction) {
        transactions[nowTransaction] = transaction;
        this.nowTransaction++;
        balance += transaction.getAmount();

    }

}
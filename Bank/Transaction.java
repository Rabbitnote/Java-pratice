public class Transaction {
    private String date;
    private int transactionNumber;
    private double amount;

    Transaction(int transactionNumber, String date, double amount) {
        this.date = date;
        this.transactionNumber = transactionNumber;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;

    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
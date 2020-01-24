public class Saving extends BankAccount {
    private double interestRate;

    Saving(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    Saving(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double getBalance() {
        // TODO Auto-generated method stub
        return super.getBalance();
    }

    public void endYear() {
        double balance = super.getBalance();
        balance = balance + balance * interestRate / 100;
        super.setBalance(balance);

    }

}
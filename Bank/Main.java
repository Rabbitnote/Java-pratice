

public class Main{
    public static void main(String[] args) {
        Saving Note = new Saving(00001,4000);
        Transaction num1 = new Transaction(1,"13/2/2001",700);
        Transaction num2 = new Transaction(2,"14/5/20020",8200);
        Note.addTransaction(num1);
        Note.addTransaction(num2);
        System.out.println(Note.getBalance());

        Transaction num3 = new Transaction(3,"29/6/2020",-1500);
        Transaction num4 = new Transaction(4,"30/7/2020",-100);
        Note.addTransaction(num3);
        System.out.println(Note.getAccountNumber());
        Note.addTransaction(num4);
        System.out.println(Note.getBalance());
        Note.endYear();
        System.out.println(Note.getBalance());
        System.out.println("");
        //Checking account Tester
        Checking wow = new Checking(000002,3000);
        wow.addTransaction(num1);
        System.out.println(wow.getBalance());
        wow.addTransaction(num4);
        System.out.println(wow.getAccountNumber());
        wow.addTransaction(num4);
        System.out.println(wow.getBalance());
        System.out.println(wow.getOverdraftAmount());
        System.out.println("");
        wow.addTransaction(num2);
        System.out.println(wow.getBalance());
        System.out.println(wow.getOverdraftAmount());
    }
}
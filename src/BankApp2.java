import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp2 {
    public static void main(String[] args) {
        Account a1 = new Account( "Joe Pass", 2.5);
        Account a2 = new Account( "Jimi Hendrix", 2.5);

        a1.deposit(200);
        a1.deposit(1000);
        a1.withdraw(400);
        a1.annualInterest();

        a1.printTransactions();
        System.out.println();
        a2.printTransactions();

    }
}
class Account{
    protected int accountNo;
    protected String owner;
    protected double balance;
    protected double interestRate;
    protected ArrayList<Transaction> transactions = new ArrayList<>();

    static private  int noOfAccounts = 0;

    Account( String ow, double rate){
        noOfAccounts++;
        accountNo = noOfAccounts; owner = ow; balance = 0; interestRate = rate;
    }
    public String toString(){
        return "KonroNr " + accountNo + ": " + owner + " " + balance;
    }
    public void printTransactions(){
        System.out.println(toString());
        System.out.println("Tekst\tDato\t\tBeløb\tSaldo");
        for (Transaction t : transactions){
            System.out.println(t);
        }
    }
    public void deposit(double amount){
        balance += amount;
        transactions.add(new Transaction("Indsat", amount, balance));
    }
    public void withdraw(double amount){
        balance -= amount;
        transactions.add(new Transaction("Hævet", amount, balance));
    }
    public  void  annualInterest(){
        double interest = balance * interestRate / 100;
        balance += interest;
        transactions.add(new Transaction("Rente", interest, balance));
    }
}
class Transaction{
    String text;
    LocalDate date;
    double amount;
    double newBalance;

    Transaction(String text, double amount, double newBalance){
        this.text = text;
        date = LocalDate.now();
        this.amount = amount;
        this.newBalance = newBalance;
    }
    public  String toString(){
        return text + "\t" + date + "\t" + amount + "\t" + newBalance;
    }
}

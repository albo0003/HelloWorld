import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class BankApp3 {

    public static void main(String[] args) {


        ArrayList<Account> list = new ArrayList<>();
        Indlaan a1 = new Indlaan("Jill", 3);
        a1.deposit(100);
        a1.withdraw(50);


        HojRente a2 = new HojRente("Bob", 10, 100000, LocalDate.of(2023, 12, 24));
        a2.deposit(20);
        a2.withdraw(100000);

        Credit a3 = new Credit("Jean B", 3, -100);
        a3.withdraw(50);
        a3.withdraw(75);

        Millionair a4 = new Millionair("Thomas Loejmand Dahl", 2.5);
        
        a4.deposit(500);
        Millionair a5 = new Millionair("Felix L", 2.5);
        a5.deposit(1000);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        for (Account a: list){
            a.annualInterest();
            a.deposit(100);
            a.printTransactions();
        }
      //  giveCashPrize();
    }
   /* static void giveCashPrize(){
        ArrayList<Millionair> mAccounts = new ArrayList<>();
        Random gen = new Random();
        int rChosenAc = gen.nextInt(1, Millionair.millionairAccounts +1);
        for (Millionair m : mAccounts){

        }
    }*/
    static void addMAcc(){

    }
}

class Indlaan extends Account{
    Indlaan(String ow, double rate){
        super(ow, rate);
    }
    public void withdraw(double amount){
        if(amount > balance)
            System.out.println("Der er ikke penge nok på kontoen");
        else
            super.withdraw(amount);
    }
}
class HojRente extends Account{
    LocalDate releaseData;

    HojRente(String ow, double rate, double startBalance, LocalDate date){
        super(ow, rate);
        super.deposit(startBalance);
        releaseData = date;
    }

    public void deposit(double amount){
        System.out.println("Der kan ikke sættes penge ind på denne konto");
    }
    public  void withdraw(double amount){
        if(LocalDate.now().isBefore(releaseData))
            System.out.println("Pengene er bundet indtil " + releaseData);
        else
            super.withdraw(amount);
    }
}
class Credit extends Account{
    double maximumDept;
    Credit(String ow, double rate, double mDept){
        super(ow, rate);
        maximumDept = mDept;
    }
    public  void withdraw(double amount){
        if((balance - amount) <= maximumDept)
            System.out.println("you're too much in the red");
        else
            super.withdraw(amount);
    }
}
class Millionair extends Account{

    //int mAcNo;
   // static int millionairAccounts = 0;
    static double cashPool = 0;

    Millionair(String ow, double rate){
        super(ow, rate);

    }

    public void annualInterest() {
        cashPool += balance * interestRate / 100;

    }
    /*public  void giveCashPrize(){

        while (mAcNo != rChosenAc){

        }

    }*/
}

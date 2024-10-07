import java.util.InputMismatchException;
import java.util.Scanner;
public class TobiasesVersionValutaO {
    static Scanner keeb = new Scanner(System.in);

    static String promptUserForCurrencySelection(String msg) {
        System.out.println("Which currency do you wish to change " + msg);
        System.out.println("We offer: EUR, DKK, SEK, NOK, and ISK,");
        String currency = keeb.nextLine().toUpperCase();
        if (currency.equals("Q")) return currency;
        while (!currency.equals("EUR") && !currency.equals("DKK") && !currency.equals("NOK")
                && !currency.equals("SEK") && !currency.equals("ISK")) {
            System.out.println("Please input a valid currency");
            currency = keeb.nextLine().toUpperCase();
        }
        return currency;
    }

    static double getRateFromCurrency(String currency){
        double rate = 0;
        switch (currency){
            case("q"): break;
            case("EUR"): rate=0.13; break;
            case("DKK"): rate=1; break;
            case("NOK"): rate=1.59; break;
            case("SEK"): rate=1.52; break;
            case("ISK"): rate=20.31; break;
            default:
                System.out.println("Invalid currency");
        }
        return rate;
    }

    public static void main(String[] args) {
        double amount, rate1, rate2, converted;
        String currency1, currency2;

        while (true) {
            currency1=promptUserForCurrencySelection("from?");
            rate1=getRateFromCurrency(currency1);
            if(currency1.equals("Q")) break;

            System.out.println("Please input how much you want to exchange");
            while (true) {
                try {
                    amount = keeb.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please input a valid amount");
                }
                keeb.nextLine();
            }
            keeb.nextLine();
            if (amount==0) break;

            currency2=promptUserForCurrencySelection("to?");
            rate2=getRateFromCurrency(currency2);
            if(currency2.equals("Q")) break;
            converted=(amount/rate1)*rate2;

            System.out.format("We have exchanged your "+"%.2f ", amount);
            System.out.format(currency1+" to " +"%.2f ", converted);
            System.out.format(currency2+" at a rate of "+"%.2f\n", (1/rate1)*rate2);
        }
    }
}

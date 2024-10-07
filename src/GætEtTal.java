import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class GætEtTal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gen = new Random();
        int tal = gen.nextInt(100);
        int guessedNumber = 0;
        while (guessedNumber != tal){
            guessedNumber = Integer.valueOf(sc.next());
            if(guessedNumber < tal)
                System.out.println("higher");
            else if(guessedNumber > tal)
                System.out.println("lower");
        }
        System.out.println("you're right");
    }
}
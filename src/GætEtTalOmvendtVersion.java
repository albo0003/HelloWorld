import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class GætEtTalOmvendtVersion {
    public static void main(String[] args) {
        int totalAmountOfNumbers = 100;

        int numberOfGuesses = 0;
        Scanner sc = new Scanner(System.in);
        Random gen = new Random();
        int tal = gen.nextInt(totalAmountOfNumbers);
        String input = "";
        int min = 0;
        int max = totalAmountOfNumbers;
        while (!input.equals("c")){
            numberOfGuesses++;
            //System.out.println("number of guesses: " + numberOfGuesses);
            System.out.println(tal);
            input = sc.next();
            if (input.equals("h")){
                min = tal;
                tal = (max + min) / 2;
            }
            else if (Objects.equals(input, "l")){
                 max = tal;
                tal = (min + max) / 2;
            }
            else if(!input.equals("c"))
                System.out.println("just no");
        }
        System.out.println("i knew it");
    }
}
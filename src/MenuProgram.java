import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuProgram {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double result = 0;
        double a = 0;
        double b = 0;
        char input = ' ';
        while (true){
            System.out.println("Velkommen til Regnemaskinen");
            System.out.println("  + for Addition");
            System.out.println("  - for Subtraktion");
            System.out.println("  * for Multiplikation");
            System.out.println("  / for Division");
            System.out.println("  q for quit");
            System.out.print("Indtast operator: ");

            input = sc.next().charAt(0);
            if(input == 'q') break;

            a = tryAndCatch("a");
            b = tryAndCatch("b");
            while (b == 0 && input == '/'){
                System.out.println("du kan ikke dividere med 0");
                b = tryAndCatch("b");
            }


            switch (input){
                case '+' : result = a+b; break;
                case '-' : result = a-b; break;
                case '*' : result = a*b; break;
                case '/' : result = a/b; break;

                default:
                    System.out.println("ugyldig operator");
            }
            System.out.println("resultat: "+ a + input + b + " = " + result);
        }
        System.out.println("Tak for i dag");
    }
    static double tryAndCatch(String name){
        double n = 0;
        while (true){
            try {
                System.out.println("indtast " + name );
                n = sc.nextDouble();
                return n;
            }
            catch (InputMismatchException e){
                System.out.println("Ulovligt input, prøv igen");
                sc.nextLine();
            }
        }
    }
}

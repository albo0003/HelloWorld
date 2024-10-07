import java.io.CharArrayReader;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.io.Reader;

public class PlatEllerKrone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
       int i = (int) (Math.random() * 2);
       if (i == 1)
           System.out.println("plat");
       else
           System.out.println("krone");
       if ((Objects.equals(input, "plat") && i == 1) || (Objects.equals(input, "krone") && i == 0)){
            System.out.println("du vandt");
       }
       else
           System.out.println("du tabte");
    }

}

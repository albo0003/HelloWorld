import java.util.Scanner;

public class Opgaver357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //System.out.println(input.indexOf(" "));
       /* String[] texts = input.split(" ");
        input = "";
        for (int i = 1; i < texts.length; i++)
            input += texts[i] + " ";

            System.out.println(input);
        System.out.println(texts.length);
        System.out.println(input.replace("måske", ""));*/
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (chars.length - i <= i)
                break;
            if (chars[i] != chars[chars.length -1 - i])
                System.out.println("fejl her: " + chars[i] + " " + chars[chars.length - 1 - i] + " plads nummer: " + i );
        }

    }
}

import javax.swing.*;
import java.util.Objects;
import java.util.Random;

public class DicemanNotGame {
    public static void main(String[] args) {
        boolean keepGoing = true;
        int tal = 0;
        int highscore = 0;

        while (keepGoing) {
            String name = JOptionPane.showInputDialog("wanna keep going?");
            String[] activities = {"Breakfast", "Study", "Swim", "Fishing", "Call your mom", "Bed", "Die"};
            highscore++;
            Random gen = new Random();
            tal = gen.nextInt(activities.length);

            if (name.equals("no"))
                keepGoing = false;
            else
                JOptionPane.showMessageDialog(null,"hey " + " you are going to " + activities[tal] + " Highscore: " + highscore);

        }
        System.out.println("bye bye");
    }
}

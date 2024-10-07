import java.util.Random;
import javax.swing.JOptionPane;

public class Diceman {
    public static void main(String[] args) {
        int tal = 0;
        int highscore = 0;
        String name = JOptionPane.showInputDialog("Type your name please");
        while (tal != 6) {
            String[] activities = {"Breakfast", "Study", "Swim", "Fishing", "Call your mom", "Bed", "Die"};
            highscore++;
            Random gen = new Random();
            tal = gen.nextInt(activities.length);
            JOptionPane.showMessageDialog(null,"hey " + name + " you are going to " + activities[tal] + " Highscore: " + highscore);
        }
    }
}

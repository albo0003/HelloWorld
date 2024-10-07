import java.util.InputMismatchException;
import java.util.Scanner;

public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        String[] rooms = {"1 dobbeltseng, 500kr pr. dag", "4 single senge, 1000kr pr. dag", "asdas", "sdfasd"};
        boolean[] booked = new  boolean[rooms.length];
        while (true){
            for (int i = 0; i < rooms.length; i++){
                String bookedString = "";
                if (booked[i]) bookedString = "booked";
                else bookedString = "ledig";
                System.out.println(i+1 + ": " + rooms[i] + ": " + bookedString);
            }
            while (true){
                try {
                    input = sc.nextInt() -1;
                    if (input > 0 && input <= rooms.length)
                    break;
                }
                catch (InputMismatchException e){
                    System.out.println("not a number");
                    sc.nextLine();
                }

            }

                if (booked[input]) System.out.println("already booked sorry");
                else {
                    booked[input] = true;
                    System.out.println("you have booked " + rooms[input]);
                }

        }
    }
}

import java.util.Scanner;

public class ValutaOmregner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double amount;
        int valuta;
        String valutaName = "";
        System.out.println("Velkommen til valutaomregner.");
        System.out.println("Her kan du veksle fra danske kroner til svenske, norske, finske eller islandske kroner.");
        while (true){
            System.out.println("Indtast beløb i danske kroner (Tast 0 for at afslutte programmet): ");
            amount = sc.nextDouble(); if (amount == 0) break;
            System.out.println("Tast 1 for svenske kroner");
            System.out.println("Tast 2 for norske kroner");
            System.out.println("Tast 3 for finske euro");
            System.out.println("Tast 4 for islandske kroner");
            System.out.println("Indtast valuta: ");
            valuta = sc.nextInt();
            switch (valuta){
                case 1 : amount = amount * 1.53; valutaName = "svenske kroner"; break;
                case 2 : amount = amount * 1.60; valutaName = "norske kroner";break;
                case 3 : amount = amount * 0.13; valutaName = "finske euro";break;
                case 4 : amount = amount * 20.41; valutaName = "islandske kroner";break;
            }
            System.out.println("Til Udbetaling: " + amount + " " + valutaName);
        }
    }
}

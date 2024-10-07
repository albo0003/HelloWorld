import java.util.ArrayList;
import java.util.Random;

public class PokerApp {
    public static void main(String[] args) {
        PokerPlayer[] players = {new PokerPlayer("Alexander"), new PokerPlayer("Lucas")};
        ArrayList<Card> deck = new ArrayList<>();
        String[] differentSuits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        for (int i = 0; i < differentSuits.length; i++){
            for (int j = 0; j < 13; j++){
                deck.add(new Card(differentSuits[i], j + 2));
            }
        }
        Random gen = new Random();
        for (int i = 0; i < players.length; i++){
            System.out.println(players[i].name);
            for (int j = 0; j < 5; j++){
                int r = gen.nextInt(0, deck.size());
                players[i].hand.add(deck.get(r));
                System.out.println(deck.get(r));
                deck.remove(r);
            }
        }
      /*  for (Card d: deck){
            System.out.println(d);
        }*/
        for (PokerPlayer p: players){
            p.highestCard = p.FindHC();
            p.flush = p.findIfFLush();
        }
    }
}
class PokerPlayer{
    String name;
    ArrayList<Card> hand = new ArrayList<>();

    Card highestCard;
    boolean flush;
    Card FindHC(){
        Card c = hand.get(0);
        for (int i = 0; i < hand.size(); i++){
            if (hand.get(i).rank > c.rank)
                c = hand.get(i);
        }
        System.out.println(c);
        return  c;
    }
    boolean findIfFLush(){
        String s = hand.get(0).suit;
        for(int i = 0; i < hand.size(); i++){
            if (hand.get(i).suit.equals(s)) return false;
        }
        return true;
    }
    
    PokerPlayer(String n){
        name = n;
    }
}
class Card{
    String suit;
    int rank;
    public String toString(){
        return  suit + " " + rank;
    }

    Card(String s, int r){
        suit = s; rank = r;
    }
}
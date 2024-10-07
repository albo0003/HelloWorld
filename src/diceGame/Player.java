package diceGame;

public class Player {
    Cup cup = new Cup();
    String name;
    int sum = 0;

    void  turn(){
        cup.roll();
        sum += cup.getSum();
    }
    Player(String n){
        name = n;
    }
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        Player p = new Player("Bob");
        System.out.println(p);
        while (p.sum < 100){
            p.turn();
            System.out.println(p.sum);
        }
    }
}

package diceGame;

public class OneHundred {
    Player p1 = new Player("bob");
    Player p2 = new Player("Jill");

    void  play(){
        while (p1.sum < 100 && p2.sum < 100){
            p1.turn();
            p2.turn();
            System.out.println(p1.sum + "\t\t" + p2.sum);
        }
        if(p1.sum >= 100 && p2.sum >= 100)
            System.out.println("you both got 100");
        else if (p2.sum <100)
            System.out.println(p1 + " Won");
        else
            System.out.println(p2 + " Won");
    }

    public static void main(String[] args) {
        while (true){
            OneHundred game = new OneHundred();
            game.play();
        }

    }
}


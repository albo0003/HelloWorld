import java.util.List;

public class javabogFørsteOpgaver {
    /*public static void main(String[] args){
        int længde = 3;
        int bredde = 7;
        System.out.println("Arealet er " + længde * bredde);
    }*/
    /*public static void main(String[] args){
        int x = 7;
        int y = 3*x*x+6*x+9;
        System.out.println(y);
    }*/
    /*public static void main(String[] args){
        float saldoIDollars = 55.01f;
        float saldoIEuro = saldoIDollars * 0.95f;
        System.out.println(saldoIEuro);
    }*/
    public static void main(String[] args){
        double[] tilfældigeTal = new double[3];
        float gennemsnit = 0f;
        for(int i = 0; i < tilfældigeTal.length; i++){
            tilfældigeTal[i] = Math.random();
            gennemsnit+= tilfældigeTal[i];
            System.out.println(tilfældigeTal[i]);
        }
        gennemsnit /= tilfældigeTal.length;
        System.out.println(gennemsnit);
    }
}

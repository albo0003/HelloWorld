public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            String line = "";
            for (int j = 0; j < 10; j++){
                line += (i + 1) * (j + 1) + "\t";
            }
            System.out.println(line);
        }
    }
}

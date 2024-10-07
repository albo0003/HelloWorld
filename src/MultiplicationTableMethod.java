public class MultiplicationTableMethod {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            PrintTabel(i + 1);
        }

    }
    static  void  PrintTabel(int i){
        String line = "";
        for (int j = 0; j < 10; j++){
            line += i * (j + 1) + "\t";
        }
        System.out.println(line);
    }
}

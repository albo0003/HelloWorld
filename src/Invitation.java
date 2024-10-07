public class Invitation {
    public static void main(String[] args) {
       String[] names = {"Birgitte", "Lars", "Johan"};
        for (int i = 0; i < names.length; i++)
            printInv(names[i]);
    }
    static void printInv(String d){
        System.out.println("Kære " + d);
        System.out.println("vil du komme til min føsdelsdag?");
        System.out.println("Fredag d. 13/09/2024 kl. 10:25");
        System.out.println("Kærlig hilsen Alex");
        System.out.println();
    }
}

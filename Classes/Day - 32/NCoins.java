public class NCoins {
    public static void printAllPossible(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        printAllPossible(n - 1, ans + "H");
        printAllPossible(n - 1, ans + "T");
    }
    public static void main(String args[]){
        int n = 3;
        printAllPossible(n, "");
    }
}
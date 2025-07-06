public class NBits {
    public static void printAllPossible(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        printAllPossible(n - 1, ans + "0");
        printAllPossible(n - 1, ans + "1");
    }
    public static void main(String[] args) {
        int n = 3;
        printAllPossible(n, "");
    }
}
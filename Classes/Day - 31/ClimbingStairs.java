public class ClimbingStairs {
    public static void paths(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }else if(n < 0){
            return;
        }
        // 1 ka jump -
        paths(n - 1, ans + "1");
        // 2 ka jump -
        paths(n - 2, ans + "2");
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Paths -");
        paths(n, "");
    }
}
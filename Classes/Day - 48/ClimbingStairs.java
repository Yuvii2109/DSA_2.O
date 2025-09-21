public class ClimbingStairs {
    public static int fibonacciTabulation(int n) {
        if(n <= 1){
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static int fibonacciMemoization(int n, int[] dp) {
        if(n <= 1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = fibonacciMemoization(n - 1, dp) + fibonacciMemoization(n - 2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        for(int i = 0; i <= n; i++){
            dp[i] = -1;
        }
        System.out.println("Number of ways to climb " + n + " stairs is - " + fibonacciMemoization(n, dp));
        System.out.println("Number of ways to climb " + n + " stairs using tabulation is - " + fibonacciTabulation(n));
    }
}
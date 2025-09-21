public class FibonacciDP {
    public static int fibonacciMemoization(int n, int[] dp) {
        if(n <= 1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = fibonacciMemoization(n - 1, dp) + fibonacciMemoization(n - 2, dp);
        return dp[n];
    }
    public static int fibonacciTabulation(int n) {
        if(n <= 1){
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static int fibonacci(int n) {
        return fibonacciTabulation(n);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of " + n + " is - " + fibonacci(n));
        int[] dp = new int[n + 1];
        for(int i = 0; i <= n; i++){
            dp[i] = -1;
        }
        System.out.println("Fibonacci of " + n + " using memoization is - " + fibonacciMemoization(n, dp));
    }
}
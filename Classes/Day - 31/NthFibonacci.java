public class NthFibonacci {
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }else{
            int smallProblem1 = fib(n - 1);
            int smallProblem2 = fib(n - 2);
            int bigProblem = smallProblem1 + smallProblem2;
            return bigProblem;
        }
    }
    public static int fibMemo(int n){
        int f0 = 0, f1 = 1, fn = 0;
        if(n == 0 || n == 1){
            return n;
        }
        while(n > 1){
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            n--;
        }
        return fn;
    }
    public static int fibTab(int n) {
        int dp[] = new int [n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int fibN = fibTab(n);
        System.out.println(n + "th Fibonacci Number - " + fibN);
    }
}
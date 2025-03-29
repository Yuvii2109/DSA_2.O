import java.util.Scanner;

public class FibonacciSeries {
    public static int fibonacciRecursion(int n){
        if(n == 0 || n == 1){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static int fibonacci(int n){
        int f0 = 0, f1 = 1, fn = 0;
        if(n == 1 || n == 0){
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
    public static int fibonacciTabulation(int n){
        int dp[] = new int[n+1]; // 0-n = n+1 elements and we need to find nth element
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the value of n - ");
            int n = sc.nextInt();
            System.out.println("nth value of fibonacci is - " + fibonacciTabulation(n));
        }
    }
}
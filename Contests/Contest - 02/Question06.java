/*
    Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.

    Input Format - Constraints - 0 <= N <= 1000
    Output Format - 
        Sample Input - 10
        Sample Output - 55
        Explanation - The 0th fibonnaci is 0 and 1st fibonnaci is 1.
*/

import java.util.Scanner;

public class Question06 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int dp[] = new int[n+1];
            dp[0] = 0;
            dp[1] = 1;
            for(int i = 2; i <= n; i++){
                dp[i] = dp[i-1] + dp[i-2];
            }
            System.out.println(dp[n]);
        }
    }
}
import java.util.Scanner;

/*
    You are given N distinct denominations of coins and a target integer amount T. Each coin has an infinite supply, and you can use each coin denomination as many times as needed.

    Your task is to calculate the number of distinct ways to make the target amount T using the given coin denominations. Since the answer can be large, output the result modulo 109 + 7.

    Input Format - The first line contains two integers N and T — the number of coin denominations and the target amount. The second line contains N space-separated integers Arr[i] — the coin denominations.
    Constraints - 
        1 ≤ N ≤ 500
        0 ≤ T ≤ 5000
        1 ≤ Arr[i] ≤ 5000
        All Arr[i] are distinct.
    Output Format - Output a single integer — the number of ways to form the target amount T using the given coin denominations, modulo 109 + 7.
    Sample Input - 
        3 5
        1 2 5
    Sample Output - 4
    Explanation - We need to find ways to sum up to 5 using coins of denominations 1, 2, 5 -
        1 + 1 + 1 + 1 + 1 (all 1s)
        1 + 1 + 1 + 2
        1 + 2 + 2
        5 (single coin)
        Total ways = 4.
*/

public class Question05 {
    private static void coinChangeWays(int N, int T, int[] arr){
        int mod = 1000000007;
        long[] dp = new long[T + 1];
        dp[0] = 1;

        for(int i = 0; i < N; i++){
            for(int j = arr[i]; j <= T; j++){
                dp[j] = (dp[j] + dp[j - arr[i]]) % mod;
            }
        }
        System.out.println(dp[T]);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int N = sc.nextInt();
            int T = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }
            coinChangeWays(N, T, arr);
        }
    }
}
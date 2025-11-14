import java.util.Scanner;

/*
    You are given an array of integers. Your task is to find the length of the Longest Increasing Subsequence (LIS) from the given array. The Longest Increasing Subsequence (LIS) is a subsequence of a sequence where the elements are sorted in strictly increasing order and the subsequence is as long as possible.

    Input Format - The first line contains a single integer n, the size of the array. The second line contains n integers, the elements of the array.

    Constraints - 
        1 ≤ n ≤ 106
        -106 ≤ arr[i] ≤ 106
    Output Format - Print a single integer, representing the length of the longest increasing subsequence.
    Sample Input - 
        7
        10 2 9 2 5 3 7
    Sample Output - 3
    Explanation - One of the possible longest increasing subsequence is [2, 5, 7], which has a length of 3.
*/

public class Question10 {
    private static void longestIncreasingSubsequence(int n, int[] arr){
        int[][] dp = new int[n + 1][n + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(arr[i - 1] > arr[j - 1]){
                    // Including the current element
                    dp[i][j] = Math.max(dp[i - 1][j], 1 + dp[i - 1][j - 1]);
                }else{
                    // Excluding the current element
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][n]);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            longestIncreasingSubsequence(n, arr);
        }
    }
}
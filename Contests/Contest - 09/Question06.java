
import java.util.Scanner;

/*
    A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements. For example, the sequence {A,B,D} is a subsequence of {A,B,C,D,E,F}, obtained after removal of elements C, E and F.

    Given two strings A and B of size n and m respectively, you have to print the Longest Common Subsequence(LCS) of strings A and B, where LCS is the longest sequence present in both A and B.

    Note - It is gauranteed that there is only one unique longest common subsequence

    Input Format - Two strings A and B.
    Constraints - 1 <= n,m <= 10^3
    Output Format - Output the LCS of A and B.
    Sample Input - 
        abc
        acd
    Sample Output - ac
*/

public class Question06 {
    private static void LCS(String A, String B){
        int n = A.length();
        int m = B.length();
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(A.charAt(i - 1) == B.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        StringBuilder lcs = new StringBuilder();
        int i = n, j = m;
        while(i > 0 && j > 0){
            if(A.charAt(i - 1) == B.charAt(j - 1)){
                lcs.append(A.charAt(i - 1));
                i--;
                j--;
            }else{
                if(dp[i - 1][j] > dp[i][j - 1]){
                    i--;
                }else{
                    j--;
                }
            }
        }
        System.out.println(lcs.reverse().toString());
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String A = sc.nextLine();
            String B = sc.nextLine();
            LCS(A, B);
        }
    }
}
/*
    Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

    A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

    For example, "ace" is a subsequence of "abcde".
    A common subsequence of two strings is a subsequence that is common to both strings.

    Example 1 -
        Input - text1 = "abcde", text2 = "ace" 
        Output - 3  
        Explanation - The longest common subsequence is "ace" and its length is 3.

    Example 2 -
        Input - text1 = "abc", text2 = "abc"
        Output - 3
        Explanation - The longest common subsequence is "abc" and its length is 3.

    Example 3 -
        Input - text1 = "abc", text2 = "def"
        Output - 0
        Explanation - There is no such common subsequence, so the result is 0.
    
    Constraints -
        1 <= text1.length, text2.length <= 1000
        text1 and text2 consist of only lowercase English characters.
*/

public class LongestCommonSubsequence {
    public static void printDpTable(int[][] dp){
        for(int[] d : dp){
            for(int j = 0; j < d.length; j++){
                System.out.print(d[j] + " ");
            }
            System.out.println();
        }
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n + 1][m + 1];
        // DP State - dp[i][j] = length of longest common subsequence between text1 (1 to i) and text2 (1 to j)

        // Base Case - dp[0][j] = 0 and dp[i][0] = 0 (Already initialized to 0)
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1]; // Characters match, hence we take the diagonal value and add 1 to it
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // Characters don't match, hence we take the maximum of left and top cell
                    // Left cell - We ignore the current character of text2
                    // Top cell - We ignore the current character of text1
                }
            }
        }
        System.out.println("DP Table - ");
        printDpTable(dp);
        System.out.println();
        return dp[n][m];
    }
    // If there are 3 strings, then the DP state will be dp[i][j][k] = length of longest common subsequence between text1 (1 to i), text2 (1 to j) and text3 (1 to k)
    public static int LCS3D(String text1, String text2, String text3) {
        int n = text1.length();
        int m = text2.length();
        int p = text3.length();
        int dp[][][] = new int[n + 1][m + 1][p + 1];
        // DP State - dp[i][j][k] = length of longest common subsequence between text1 (1 to i), text2 (1 to j) and text3 (1 to k)

        // Base Case - dp[0][j][k] = 0, dp[i][0][k] = 0 and dp[i][j][0] = 0 (Already initialized to 0)
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                for(int k = 1; k <= p; k++){
                    if(text1.charAt(i - 1) == text2.charAt(j - 1) && text2.charAt(j - 1) == text3.charAt(k - 1)){
                        dp[i][j][k] = 1 + dp[i - 1][j - 1][k - 1]; // Characters match, hence we take the diagonal value and add 1 to it
                    }else{
                        dp[i][j][k] = Math.max(dp[i - 1][j][k], Math.max(dp[i][j - 1][k], dp[i][j][k - 1]));
                        // Characters don't match, hence we take the maximum of left, top and front cell
                        // Left cell - We ignore the current character of text2
                        // Top cell - We ignore the current character of text1
                        // Front cell - We ignore the current character of text3
                    }
                }
            }
        }
        return dp[n][m][p];
    }
    public static void main(String args[]){
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println("Length of Longest Common Subsequence - " + longestCommonSubsequence(text1, text2));
    }
}
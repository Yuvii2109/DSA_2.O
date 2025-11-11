import java.util.Scanner;

/*
    Given 3 strings ,the task is to find the longest common sub-sequence in all three given sequences.

    Input Format - First line contains first string . Second line contains second string. Third line contains the third string.
    Constraints - The length of all strings is |s|< 200
    Output Format - Output an integer denoting the length of longest common subsequence of above three strings.
    Sample Input - 
        GHQWNV
        SJNSDGH
        CPGMAH
    Sample Output - 2
    Explanation - "GH" is the longest common subsequence
*/

public class Question01 {
    private static int LCS3D(String a, String b, String c){
		int n = a.length();
		int m = b.length();
		int o = c.length();
		int[][][] dp = new int[n + 1][m + 1][o + 1];
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= m; j++){
				for(int k = 1; k <= o; k++){
					if(a.charAt(i - 1) == b.charAt(j - 1) && b.charAt(j - 1) == c.charAt(k - 1)){
						dp[i][j][k] = 1 + dp[i - 1][j - 1][k - 1];
					}else{
						dp[i][j][k] = Math.max(dp[i - 1][j][k], Math.max(dp[i][j - 1][k], dp[i][j][k - 1]));
					}
				}
			}
		}
		return dp[n][m][o];
	}

    public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in)){
			String a = sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int result = LCS3D(a, b, c);
			System.out.println(result);
		}
    }
}
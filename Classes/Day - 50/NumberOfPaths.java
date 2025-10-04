public class NumberOfPaths {
    // Constant Time Complexity - O(1) code 
    public static int bestSol(int m, int n){
        int N = m + n - 2; // Total moves to reach (m-1, n-1) from (0,0)
        int r = m - 1; // Number of down moves
        double res = 1;
        for(int i = 1; i <= r; i++){
            res = res * (N - r + i) / i;
        }
        return (int)res;
    }
    public static int numberOfPaths(int m, int n) {
        int[][] dp = new int[m][n];
        // Base case - There's only one way to reach any cell in the first row or first column
        for(int i = 0; i < m; i++){
            dp[i][0] = 1;
        }
        for(int j = 0; j < n; j++){
            dp[0][j] = 1;
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
    public static void main(String args[]){
        int m = 3, n = 3;
        System.out.println(bestSol(m, n));
    }
}
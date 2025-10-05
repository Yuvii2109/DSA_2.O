
import java.util.Arrays;

/*
    You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

    Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

    You may assume that you have an infinite number of each kind of coin.

    Example 1 -
        Input - coins = [1,2,5], amount = 11
        Output - 3
        Explanation - 11 = 5 + 5 + 1

    Example 2 -
        Input - coins = [2], amount = 3
        Output - -1

    Example 3 -
        Input - coins = [1], amount = 0
        Output - 0   

    Constraints -
        1 <= coins.length <= 12
        1 <= coins[i] <= 231 - 1
        0 <= amount <= 104
*/

public class CoinChange {
    public static void printDpTable(int[][] dp){
        for(int[] d : dp){
            for(int j = 0; j < d.length; j++){
                System.out.print(d[j] + " ");
            }
            System.out.println();
        }
    }
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n + 1][amount + 1];
        // DP State - dp[i][j] = minimum number of coins required to make the amount j using coins up to i (1 to i)
        int largeVal = amount + 1;
        for(int i = 0; i <= n; i++){
            Arrays.fill(dp[i], largeVal); // Sabko highest value set krdo... 
        }
        // Base Case - When amount is 0, 0 coins are needed
        for(int i = 0; i <= n; i++){
            dp[i][0] = 0;
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= amount; j++){
                if(coins[i - 1] <= j){
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i - 1]]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println("DP Table - ");
        printDpTable(dp);
        System.out.println();
        if(dp[n][amount] == largeVal){
            return -1;
        }else{
            return dp[n][amount];
        }
    }
    public static void main(String args[]){
        int coins[] = {1, 2, 5};
        int amount = 11;
        System.out.println("Number of minimum coins required - " + coinChange(coins, amount));
    }
}
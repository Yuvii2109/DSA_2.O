/*
    Given n items, each with a specific weight and value, and a knapsack with a capacity of W, the task is to put the items in the knapsack such that the sum of weights of the items <= W and the sum of values associated with them is maximized. 

    Note - You can either place an item entirely in the bag or leave it out entirely. Also, each item is available in single quantity.

    Examples -
        Input - W = 4, val[] = [1, 2, 3], wt[] = [4, 5, 1] 
        Output - 3
        Explanation - Choose the last item, which weighs 1 unit and has a value of 3.

        Input - W = 3, val[] = [1, 2, 3], wt[] = [4, 5, 6] 
        Output - 0
        Explanation - Every item has a weight exceeding the knapsack's capacity (3).

        Input - W = 5, val[] = [10, 40, 30, 50], wt[] = [5, 4, 2, 3] 
        Output - 80
        Explanation - Choose the third item (value 30, weight 2) and the last item (value 50, weight 3) for a total value of 80.
*/

public class ZeroOneKnapsack {
    public static void printDpTable(int[][] dp){
        for(int[] d : dp){
            for(int j = 0; j < d.length; j++){
                System.out.print(d[j] + " ");
            }
            System.out.println();
        }
    }
    public static int knapsack(int W, int wt[], int val[], int n) {
        int[][] dp = new int[n + 1][W + 1];

        // The dp state is - dp[i][w] = maximum value that can be attained with a knapsack capacity w using items up to i (1 to i)
        for(int i = 1; i <= n; i++){
            for(int w = 1; w <= W; w++){
                if(wt[i - 1] <= w){
                    dp[i][w] = Math.max(dp[i - 1][w], val[i - 1] + dp[i - 1][w - wt[i - 1]]); // Either we don't take the item, hence dp[i - 1][w] or we take the item, hence val[i - 1] + dp[i - 1][w - wt[i - 1]]
                }else{
                    dp[i][w] = dp[i - 1][w]; // We can't take the item as its weight exceeds the current capacity w
                }
            }
        }
        printDpTable(dp);
        return dp[n][W];
    }
    public static void main(String args[]) {
        int val[] = {10, 40, 30, 50};
        int wt[] = {5, 4, 2, 3};
        int W = 5;
        int n = val.length;
        System.out.println(knapsack(W, wt, val, n));
    }
}
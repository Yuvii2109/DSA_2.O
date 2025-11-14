
import java.util.Scanner;

/*
    Prateek went to purchase fruits mainly apples, mangoes and oranges. There are N different fruit sellers in a line. Each fruit seller sells all three fruit items, but at different prices. Prateek, obsessed by his nature to spend optimally, decided not to purchase same fruit from adjacent shops. Also, Prateek will purchase exactly one type of fruit item (only 1kg) from each shop.

    Prateek wishes to spend minimum money buying fruits using this strategy. Help Prateek determine the minimum money he will spend. If he becomes happy, he may offer you discount on your favorite course in Coding Blocks ;). All the best!

    Input Format - First line indicates number of test cases T. Each test case in its first line contains N denoting the number of fruit sellers in Fruit Market. Then each of next N lines contains three space separated integers denoting cost of apples, mangoes and oranges per kg with that particular fruit seller.
    Constraints - 1 ≤ T ≤ 10 1 ≤ N ≤ 10^5 Cost of each fruit(apples/mangoes/oranges) per kg does not exceed 10^4
    Output Format - For each test case, output the minimum cost of shopping taking the mentioned conditions into account in a separate line.
    Sample Input - 
        2
        3
        1 50 50
        50 50 50
        1 50 50
        4
        1 2 3
        3 2 1
        1 1 1
        1 1 1
    Sample Output -
        52
        4
    Explanation - 
        Test Case 1 - There are two ways, each one gives 52 as minimum cost. One way is buy apples from first shop, mangoes from second shop and apples from third shop or he can buy apples from first shop, oranges from second shop and apples from third shop. Both ways , cost comes up to 1 + 50 + 1 = 52
        Test Case 2 - Answer is 4. Total 6 ways
*/

public class Question07 {
    private static void buyingFruits(int N, int[][] cost){
        int[][] dp = new int[N][3];
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];
        for(int i = 1; i < N; i++){
            dp[i][0] = cost[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = cost[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = cost[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }
        int result = Math.min(dp[N - 1][0], Math.min(dp[N - 1][1], dp[N - 1][2]));
        System.out.println(result);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int T = sc.nextInt();
            while(T-- > 0){
                int N = sc.nextInt();
                int[][] cost = new int[N][3];
                for(int i = 0; i < N; i++){
                    cost[i][0] = sc.nextInt();
                    cost[i][1] = sc.nextInt();
                    cost[i][2] = sc.nextInt();
                }
                buyingFruits(N, cost);
            }
        }
    }
}
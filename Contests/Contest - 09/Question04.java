import java.util.Scanner;

/*
    Cody went to the market to buy some oranges for his N friends. There he finds oranges wrapped in packets, with the price of i^th packet as val[i].
    Now he wants to buy exactly W kg oranges, so he wants you to tell him what minimum price he should pay to buy exactly W kg oranges. Weight of i^th packet is i kg. If price of i^th packet is -1 then this packet is not available for sale. The market has infinite supply of orange packets.

    Input Format - First line of input contains two space separated integers N and W, the number of friend he has and the amount of Oranges in kilograms which he should buy. The second line contains W space separated integers in which the i^th integer specifies the price of a ‘i’kg apple packet. A value of -1 denotes that the corresponding packet is unavailable
    Constraints - 1 <= N,W,val[ ] <= 10^3
    Output Format - Output a single integer denoting the minimum price Code should pay to get exactly W kg oranges. Else print -1 if it is not possible to fill the bag.
    Sample Input - 
        5 5
        1 2 3 4 5
    Sample Output - 5
*/

public class Question04 {
    private static void minimumMoneyNeeded(int W, int[] val){
        int[] dp = new int[W + 1];
        dp[0] = 0;

        for(int i = 1; i <= W; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j = 1; j <= i; j++){
                if(val[j] != -1 && dp[i - j] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], val[j] + dp[i - j]);
                }
            }
        }

        if(dp[W] == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(dp[W]);
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            @SuppressWarnings("unused")
            int N = sc.nextInt();
            int W = sc.nextInt();
            int[] val = new int[W + 1];
            for(int i = 1; i <= W; i++){
                val[i] = sc.nextInt();
            }
            minimumMoneyNeeded(W, val);
        }
    }
}
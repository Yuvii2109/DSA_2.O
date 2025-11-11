import java.util.Scanner;

/*
    You are given an integer n, the size of the array, and an integer target.You are also given an array arr consisting of n positive integers. Your task is to determine whether there exists a subset of arr such that the sum of its elements is equal to target.

    If such a subset exists, print YES. Otherwise, print NO.

    A subset is a set derived from the array by selecting any combination of elements, regardless of their order. For example, the subsets of the array [3, 4, 5] are - {}, {3}, {4}, {5}, {3, 4}, {3, 5}, {4, 5}, {3, 4, 5}.

    Input Format - The first line contains a single integer n — the size of the array. The second line contains a single integer target — the target sum. The third line containing n positive integers arr[1], arr[2], ..., arr[n] — the elements of the array.

    Constraints - 
        1 ≤ n ≤ 200
        0 ≤ target ≤ 104
        0 ≤ arr[i] ≤ 109
    Output Format - Print YES if there exists a subset of arr with a sum equal to target. Otherwise, print NO.
    Sample Input - 
        5
        11
        2 3 7 8 10
    Sample Output - YES
    Explanation - The subset {3, 8} adds up to 11, so the answer is YES.
*/

public class Question03 {
    private static boolean subsetSum(int[] arr, int n, int target){
        boolean[][] dp = new boolean[n + 1][target + 1];

        for(int i = 0; i <= n; i++){
            dp[i][0] = true;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= target; j++){
                if(arr[i - 1] <= j){
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][target];
    }
    private static void printResult(boolean result){
        if(result){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int target = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            boolean result = subsetSum(arr, n, target);
            printResult(result);
        }
    }
}
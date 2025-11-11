
import java.util.Scanner;

/*
    You are provided an array of integers where each element represents the max number of steps you can take to move ahead. You need to check that how many minimum steps required to reach at the end of the array (index arr.len -1 is your ending).

    Hint - If N == 0 you can never move forward, your return INT_MAX (Infinity).
    Input Format - First line contains integer t which is number of test case. For each test case, it contains an integers n which the size of array A[]. Next line contains n space separated integers.
    Constraints - 
        1 <= t <= 50
        1 <= n <= 1000
        0 <= A[i] <= 100
    Output Format - Print the minimum number of jumps.
    Sample Input - 
        1
        11
        1 3 5 8 9 2 6 7 6 8 9
    Sample Output - 3
    Explanation - 1-> 3 (you can pick 5 or 8 or 9 , pick either 8 or 9) -> 8 -> 9
*/

public class Question02 {
    private static int minJumps(int[] arr, int n){
        if(n <= 1) return 0;
        if(arr[0] == 0) return Integer.MAX_VALUE;

        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;

        for(int i = 1; i < n; i++){
            if(i == n - 1) return jump;

            maxReach = Math.max(maxReach, i + arr[i]);
            step--;

            if(step == 0){
                jump++;
                if(i >= maxReach) return Integer.MAX_VALUE;
                step = maxReach - i;
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            while(t-- > 0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i = 0; i < n; i++){
                    arr[i] = sc.nextInt();
                }
                System.out.println(minJumps(arr, n));
            }
        }
    }
}
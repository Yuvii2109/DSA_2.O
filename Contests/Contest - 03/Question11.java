/*
    You are given an integer array nums of size n. Your task is to find the maximum sum of a contiguous subarray within the array.

    Input Format - The first line contains an integer n, the size of the array. The second line contains n space-separated integers, representing the elements of the array.
    Constraints - 1 ≤ n ≤ 2 x 105; -10^9 ≤ nums[i] ≤ 10^9
    Output Format - Output a single integer, the maximum sum of a contiguous subarray.
        Sample Input - 
            9
            -2 1 -3 4 -1 2 1 -5 4
        Sample Output - 6 
        Explanation - The subarray [4, -1, 2, 1] has the maximum sum of 6.
*/

import java.util.Scanner;

public class Question11 {
    @SuppressWarnings("unused")
    public static long maxSubarray(int[] arr){
        /*
            if(arr.length == 1){
                return arr[0];
            }
            int maxSoFar = arr[0];
            int currentSum = arr[0];
            int n = arr.length;
            for(int i = 1; i < n; i++){
                currentSum = Math.max(arr[i], currentSum + arr[i]);
                maxSoFar = Math.max(currentSum, maxSoFar);
            }
            return maxSoFar;
        */
        int n = arr.length;
        long maxSoFar = arr[0], currentSum = arr[0];
        int bestStart = 0, bestEnd = 0, currentStart = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] > currentSum + arr[i]){
                currentSum = arr[i];
                currentStart = i;
            }else{
                currentSum += arr[i];
            }
            if(currentSum > maxSoFar){
                maxSoFar = currentSum;
                bestStart = currentStart;
                bestEnd = i;
            }
        }
        return maxSoFar;
    }
    public static void main (String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            long k = maxSubarray(arr);
            System.out.println(k);
        }
    }
}
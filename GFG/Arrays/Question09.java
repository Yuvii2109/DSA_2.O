/*
    Given an array arr[] denoting heights of N towers and a positive 
    integer K. For each tower, you must perform exactly one of the 
    following operations exactly once.

        Increase the height of the tower by K
        Decrease the height of the tower by K
        Find out the minimum possible difference between the height of the 
        shortest and tallest towers after you have modified each tower.

    Note - It is compulsory to increase or decrease the height by K for 
    each tower. After the operation, the resultant array should not 
    contain any negative integers.

    Examples -

        Input - k = 2, arr[] = {1, 5, 8, 10}
        Output - 5
        Explanation - The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.The difference between the largest and the smallest is 8-3 = 5.

        Input - k = 3, arr[] = {3, 9, 12, 16, 20}
        Output - 11
        Explanation - The array can be modified as {3+k, 9+k, 12-k, 16-k, 20-k} -> {6, 12, 9, 13, 17}.The difference between the largest and the smallest is 17-6 = 11. 
*/

import java.util.Arrays;

public class Question09 {
    int getMinDiff(int[] arr, int k) {
        /*
            int n = arr.length;
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++){
                if(arr[i] > largest && arr[i]-k >= 0){
                    largest = arr[i];
                }
                if(arr[i] < smallest && arr[i]+k >= 0){
                    smallest = arr[i];
                }
            }
            if(smallest+k > largest-k){
                int temp = largest;
                largest = smallest;
                smallest = temp;
            }
            smallest = smallest + k;
            largest = largest - k;
            return largest-smallest;
        */
        // Above approach would only work for a few test cases
        int n = arr.length;
        Arrays.sort(arr);
        // If we decrease or increase all the values of all the array 
        // elements by k then the minimum difference between the first and 
        // the last element of the arrays would be - 
        int result = arr[n-1] - arr[0];
        
        // For all indices i increment arr[0...i-1] by k and decrement arr[i...n-1] by k
        for(int i = 1; i < n; i++){
            if(arr[i] - k < 0){
                continue;
            }
            // Minimum Height after modification
            int minH = Math.min(arr[0] + k, arr[i] - k);
            // Maximum Height after modification
            int maxH = Math.max(arr[i-1] + k, arr[n-1] - k);
            
            result = Math.min(result, maxH-minH);
        }
        return result;
    }
}
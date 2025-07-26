/*
    You are given a circular array arr[] of integers, find the maximum possible sum of a non-empty subarray. In a circular array, the subarray can start at the end and wrap around to the beginning. Return the maximum non-empty subarray sum, considering both non-wrapping and wrapping cases.

    Examples -
        Input - arr[] = [8, -8, 9, -9, 10, -11, 12]
        Output - 22
        Explanation - Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22.

        Input - arr[] = [10, -3, -4, 7, 6, 5, -4, -1]
        Output - 23
        Explanation - Maximum sum of the circular subarray is 23. The subarray is [7, 6, 5, -4, -1, 10].

        Input - arr[] = [5, -2, 3, 4]
        Output - 12
        Explanation - The circular subarray [3, 4, 5] gives the maximum sum of 12.
*/

public class Question13 {
    public int maxCircularSum(int arr[]) {
        // code here
        /*
            Brute Force - 
            
            int n = arr.length;
            int result = arr[0];
            for(int i = 0; i < n; i++){
                int currentSum = 0;
                for(int j = 0; j < n; j++){
                    int index = (i + j) % n;
                    currentSum += arr[index];
                    result = Math.max(currentSum, result);
                }
            }
            return result;
        */
        // Going optimal - 
        int n = arr.length;
        int totalSum = 0;
        int currentMaxSum = 0;
        int currentMinSum = 0;
        int maxSum = arr[0];
        int minSum = arr[0];
        
        for(int i = 0; i < n; i++){
            // Using Kadane to get Max
            currentMaxSum = Math.max(currentMaxSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currentMaxSum);
            
            // Using Kadane to get Min
            currentMinSum = Math.min(currentMinSum + arr[i], arr[i]);
            minSum = Math.min(minSum, currentMinSum);
            
            totalSum += arr[i];
        }
        
        int circularSum = totalSum - minSum;
        if(circularSum == 0){
            return maxSum;
        }
        
        return Math.max(maxSum, circularSum);
    }
}
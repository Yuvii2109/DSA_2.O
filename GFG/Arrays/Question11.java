/*
    Given an array arr[] that contains positive and negative integers (may 
    contain 0 as well). Find the maximum product that we can get in a 
    subarray of arr[]. Note - It is guaranteed that the output fits in a 
    32-bit integer.

    Examples -

        Input - arr[] = [-2, 6, -3, -10, 0, 2]
        Output - 180
        Explanation - The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180.

        Input - arr[] = [-1, -3, -10, 0, 6]
        Output - 30
        Explanation - The subarray with maximum product is {-3, -10} with product = (-3) * (-10) = 30.
        
        Input - arr[] = [2, 3, 4] 
        Output - 24 
        Explanation - For an array with all positive elements, the result is product of all elements. 
*/

public class Question11 {
    int maxProduct(int[] arr) {
        if(arr == null || arr.length == 0){
            return 0;
        }
        int maxSoFar = arr[0];
        int minSoFar = arr[0];
        int result = arr[0];
        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int tempMax = Math.max(current, Math.max(maxSoFar*current, minSoFar*current));
            minSoFar = Math.min(current, Math.min(maxSoFar*current, minSoFar*current));
            maxSoFar = tempMax;
            result = Math.max(result, maxSoFar);
        }
        return result;
    }
}
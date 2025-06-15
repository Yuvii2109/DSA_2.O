public class MaxSumSubarrayOfSizeK {
    public static int maximumSumSubarray(int[] arr, int k) {
        int n = arr.length;
        int res = 0;

        // Calculating the sum of the first K elements in the array.
        for (int i = 0; i < k; i++) {
            res += arr[i];
        }

        int curr_sum = res;

        // Iterating over the remaining elements in the array.
        for (int i = k; i < n; i++) {
            // Calculating the sum of the current subarray by
            // subtracting the first element of the previous subarray
            // and adding the current element.
            curr_sum += arr[i] - arr[i - k];
            // Updating the result with the maximum of the current sum
            // and the previous result.
            res = Math.max(res, curr_sum);
        }

        // Returning the maximum sum of a subarray of size K.
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        int k = 2;
        int maxSum = maximumSumSubarray(arr, k);
        System.out.println("Max Sum of subarray of size " + k + " is - " + maxSum);
    }
}
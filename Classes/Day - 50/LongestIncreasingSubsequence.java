/*
    Given an integer array nums, return the length of the longest strictly increasing subsequence.

    Example 1 -
        Input - nums = [10,9,2,5,3,7,101,18]
        Output - 4
        Explanation - The longest increasing subsequence is [2,3,7,101], therefore the length is 4.

    Example 2 -
        Input - nums = [0,1,0,3,2,3]
        Output - 4 

    Example 3 -
        Input - nums = [7,7,7,7,7,7,7]
        Output - 1    

    Constraints -
        1 <= nums.length <= 2500
        -104 <= nums[i] <= 104
*/

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int n = nums.length;
        int[] dp = new int[n]; // dp[i] = length of longest increasing subsequence ending at index i
        dp[0] = 1;
        int max = dp[0];
        for(int i = 1; i < n; i++){
            dp[i] = 1; // Each element is an increasing subsequence of length 1
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    // nLogn approach using binary search
    public int lengthOfLISBinarySearch(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int n = nums.length;
        int[] tails = new int[n]; // tails[i] = smallest tail of all increasing subsequences of length i + 1
        int size = 0; // size of the longest increasing subsequence found so far
        for(int num : nums){
            int left = 0, right = size;
            // Binary search for the insertion point of num in tails array
            while(left < right){
                int mid = left + (right - left) / 2;
                if(tails[mid] < num){
                    left = mid + 1;
                }else{
                    right = mid;
                }
            }
            tails[left] = num; // Update or extend the tails array
            if(left == size){
                size++; // If num is larger than any element in tails, increase the size
            }
        }
        return size; // The size of the tails array is the length of the longest increasing subsequence  
    }
}
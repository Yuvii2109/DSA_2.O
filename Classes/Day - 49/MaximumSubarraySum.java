public class MaximumSubarraySum {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int n = nums.length;
        int[] dp = new int[n]; // dp[i] = max subarray sum ending at index i
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1; i < n; i++){
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
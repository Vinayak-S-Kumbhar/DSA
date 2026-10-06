class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);


        return houseRob(nums, 0, dp);
    }
    public int houseRob(int[] nums, int n, int[] dp){
        if(n >= nums.length){
            return 0;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int rob = nums[n] + houseRob(nums, n+2, dp);
        int skip = houseRob(nums, n+1, dp);

        dp[n] =  Math.max(rob, skip);

        return dp[n];
    }
}
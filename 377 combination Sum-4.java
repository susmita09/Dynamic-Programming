class Solution {
    //TC = 0(amount * coins) SC = 0(amount) DP+RCS
    
    public int memo(int[] nums, int target, int[] dp){
        
        if(target == 0) return 1;
        if(target < 0) return 0;
        if(dp[target] != -1) return dp[target];
        
        int ways =0;
        for(int i=0;i<nums.length;i++){
            if(target - nums[i] >= 0){
                ways += memo(nums,target-nums[i],dp);
            }
        }
        return dp[target] = ways;
    }
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp,-1);
        return memo(nums,target,dp);
    }
}

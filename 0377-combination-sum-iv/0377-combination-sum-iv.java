class Solution {

    public int combinationSum4(int[] nums, int target) {
        
        int dp[]=new int[1003];
        Arrays.fill(dp,-1);
        return helper(nums,target,dp);
       
    }
    public int helper(int[] nums,int t,int[] dp){
        if(t==0){return 1;}
        if(t<0)return 0;
        if(dp[t]!=-1)return dp[t];
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=res+helper(nums,t-nums[i],dp);
        }
        dp[t]=res;
        return res;
    }
}
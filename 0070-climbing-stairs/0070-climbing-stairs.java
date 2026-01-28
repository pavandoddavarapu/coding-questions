class Solution {
    public int climbStairs(int n) {
        int memo[]=new int[n+2];
        return helper(n,memo);
    }
    public int helper(int n,int[] memo){
        if(n==0)return 1;
        if(n<0)return 0;
        if(memo[n]!=0)return memo[n];
        return memo[n]=helper(n-1,memo)+helper(n-2,memo);
    }
}
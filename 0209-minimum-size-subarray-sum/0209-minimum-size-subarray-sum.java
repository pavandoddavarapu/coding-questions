class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int a=Integer.MAX_VALUE;
        int left=0;
        int right=0;
        int ans=0;
        while(right<nums.length){
            if(ans<target){ans+=nums[right];right++;}
            else{
                a=Math.min(a,right-left);
                ans-=nums[left];left++;
            }
        }
        while(ans>=target){a=Math.min(a,right-left);ans-=nums[left];left++;}
        return a==Integer.MAX_VALUE?0:a;
    }
}
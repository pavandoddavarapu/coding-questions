class Solution {
    public int longestOnes(int[] nums, int k) {
        int z=k;
        int left=0;
        int right=0;
        int ans=0;
        while(right<nums.length){
            if(nums[right]==1){
                right++;
                ans=Math.max(ans,right-left);
            }
            else{
                if(z!=0){
                    z--;
                    right++;
                    ans=Math.max(ans,right-left);
                }
                else{
                    while(z==0){
                        if(nums[left]==0)z++;
                        left++;
                    }
                }
            }
        }
        return ans;
    }
}
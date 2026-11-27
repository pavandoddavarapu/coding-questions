class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)hs.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && hs.contains(-nums[i]))ans=Math.max(ans,nums[i]);
        }
        return ans==Integer.MIN_VALUE?-1:ans;
    }
}
class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++)nums[i]=Math.abs(nums[i]);
        Arrays.sort(nums);
        long mid=0;
        
        int left=0;
        int right=nums.length-1;
        long ans=0;

        while(left<right){
            int a=Math.abs(nums[left]);
            int b=Math.abs(nums[right]);
            ans=ans-((long)a*(long)a)+((long)b*(long)b);
            left++;
            right--;
        }
        if(nums.length%2!=0)ans=ans+((long)nums[left]*(long)nums[left]);
        return ans;
    }
}
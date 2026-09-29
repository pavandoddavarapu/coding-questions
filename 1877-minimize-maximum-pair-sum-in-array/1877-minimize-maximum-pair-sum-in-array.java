class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;int j=nums.length-1;
        int c=0;
        while(i<j){
            int a=(nums[i]+nums[j]);i++;j--;
            c=Math.max(c,a);
        }
        return c;
    }
}
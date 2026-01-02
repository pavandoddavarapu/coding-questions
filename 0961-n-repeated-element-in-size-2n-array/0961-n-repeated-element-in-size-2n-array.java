class Solution {
    public int repeatedNTimes(int[] nums) {
        if(nums.length==2)return nums[0];
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<=nums.length/2+1;i++){
            if(!hs.add(nums[i]))return nums[i];
        }
        return 0;
    }
}
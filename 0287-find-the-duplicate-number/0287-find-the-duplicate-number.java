class Solution {
    public int findDuplicate(int[] nums) {
        // int sum=0;
        // int a=0;
        // for(int i=0;i<nums.length;i++){
        //     sum=sum+i+1;
        //     a=a^nums[i];
        // }
        // return sum-a;
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!hs.add(nums[i])){return nums[i];}
        }
        return -1;
    }
}
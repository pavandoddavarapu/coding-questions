class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length==3)return false;
        boolean ans=false;
        int i=0;
        while(i<nums.length-1){
        if(nums[i]<nums[i+1])i++;
        else break;}
        
        if(i==nums.length-1 || i==0)return false;
        int j=i;
        while(i<nums.length-1){
            if(nums[i]>nums[i+1])i++;
            else break;
        }
        if(i==nums.length-1 || i==j)return false;
        j=i;
        while(i<nums.length-1){
            if(nums[i]<nums[i+1])i++;
            else break;
        }
        if(j==i)return false;
        return i==nums.length-1;
    }
}
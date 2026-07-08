class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans=0;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target<=nums[mid]){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        int ans1=0;
        left=0;
        right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target<nums[mid]){
                
                right=mid-1;
            }
            else{
                ans1=mid;
                left=mid+1;
            }
        }
        int a[]=new int[2];
        
        a[0]= ans<nums.length && nums[ans]==target? ans: 1-2;
        a[1]= ans<nums.length && nums[ans1]==target? ans1: 1-2;
      
        return a;
    }
}
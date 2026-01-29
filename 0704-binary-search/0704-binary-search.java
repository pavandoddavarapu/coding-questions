class Solution {
    public int search(int[] nums, int target) {
        return helper(nums,0,nums.length,target);
    }
    public int helper(int[] arr,int left,int right,int target){
        
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid;
            }

        }
        return -1;
    }
}
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end=0;
        for(int i=0;i<nums.length;i++){
            end=Math.max(nums[i],end);
        }
        int a=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<mid)count++;
                else{
                    count=count+(nums[i]+mid-1)/mid;

                }
            }
            if(count>threshold){start=mid+1;}
            else{end=mid-1;a=mid;}
        }
        return a;
    }
}
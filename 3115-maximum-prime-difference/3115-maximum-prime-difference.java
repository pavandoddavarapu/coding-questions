class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            int flag=0;
            if(nums[i]==1){flag++;}
        for(int j=2;j<=Math.sqrt(nums[i]);j++){
            if(nums[i]%j==0){flag++;}
        }
        if(flag==0){left=i;break;}
        }


        for(int i=nums.length-1;i>=0;i--){
            int flag=0;
            if(nums[i]==1){flag++;}
        for(int j=2;j<=Math.sqrt(nums[i]);j++){
            if(nums[i]%j==0){flag++;}
        }
        if(flag==0){right=i;break;}
        }
        return right-left;
    }
}
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans=Integer.MAX_VALUE;
        int as=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int n=nums.length-1;
            if(i>0 && nums[i]==nums[i-1])continue;
            
            while(j<n){
                int a=nums[i]+nums[j]+nums[n];
                if(ans>Math.abs(target-a)){
                    ans=Math.abs(target-a);
                    as=a;
                }
                if(a==target){return target;}
                else if(a>target){n--;}
                else{j++;}
            }
        }
        return as;
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int n=nums.length-1;
            if(i>0 && nums[i]==nums[i-1])continue;
            while(j<n){
                int ans=nums[i]+nums[j]+nums[n];
                if(ans==0){
                    List<Integer> arr=new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[n]);
                    ls.add(arr);
                    int c=nums[j];
                    while(j<n && nums[j]==c){
                        j++;
                    }
                    
                }
                else if(ans>0){n--;}
                else{j++;}
            }
        }
        return ls;
    }
}
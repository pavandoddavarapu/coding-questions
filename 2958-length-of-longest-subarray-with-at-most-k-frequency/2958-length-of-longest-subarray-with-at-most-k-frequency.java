class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int left=0;
        int right=0;
        int ans=0;
        while(right<nums.length){
            int a=nums[right];
            if(!hm.containsKey(a)){
                hm.put(a,1);ans=Math.max(right-left+1,ans);
                right++;
            }
            else if(hm.get(a)<k){
                hm.put(a,hm.get(a)+1);
                ans=Math.max(right-left+1,ans);
                right++;
            }
            else{
                while(hm.get(nums[left])!=null && hm.getOrDefault(a, 0) >= k){
                    if(hm.get(nums[left])==1){
                        hm.remove(nums[left]);
                        left++;
                    }
                    else{
                        hm.put(nums[left],hm.get(nums[left])-1);left++;
                    }
                }
            }
        }
        return ans;
    }
}
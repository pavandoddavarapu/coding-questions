class Solution {
    public int largestCombination(int[] candidates) {
        int ans=0;
        for(int i=0;i<32;i++){
            int curr=0;
        for(int a:candidates){
            if((a&(1<<i))!=0)curr++;
            
        }
        ans=Math.max(ans,curr);
        }
        return ans;
    }
}
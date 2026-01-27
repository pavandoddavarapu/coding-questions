class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int ans=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            ans=Math.max(cs,ans);
            if(cs<0){cs=0;}
            
            
        }
        return ans;
    }
}

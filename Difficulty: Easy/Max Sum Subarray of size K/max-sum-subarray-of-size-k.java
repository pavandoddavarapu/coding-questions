class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum=0;
        int b=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
            b=Math.max(b,arr[i]);
        }
        int ans=sum;
        // if(k==1){return b;}
        int s=k;
        for(int i=k;i<arr.length;i++){
            int a=sum-arr[s-k]+arr[i];
            ans=Math.max(ans,a);
            sum=sum-arr[s-k]+arr[i];
            s++;
        }
        ans=Math.max(ans,sum);
        return ans;
    }
}
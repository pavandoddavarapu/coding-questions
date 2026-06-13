class Solution {
    public int maxSum(int[] arr, int k) {
        // code here
        int left=0;
        int right=0;
        int n=arr.length;
        int ms=0;
        int sum=0;
        while(right<n){
            sum=sum+arr[right];
            while(sum>k){sum=sum-arr[left];left++;}
            if(sum<=k){
                ms=Math.max(ms,sum);
            }
            right++;
        }
        return ms;
    }
}
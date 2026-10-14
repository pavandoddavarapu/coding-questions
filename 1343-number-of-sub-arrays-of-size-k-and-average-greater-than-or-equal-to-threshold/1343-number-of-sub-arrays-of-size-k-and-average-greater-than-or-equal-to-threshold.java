class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0;
        int right=0;
        double count=0;
        while(right<k){
            count=count+arr[right];
            right++;
        }
        int ans=0;
        while(right<arr.length){
            if(count/k>=threshold)ans++;
            count=count-arr[left];
            left++;
            count=count+arr[right];
            right++;
        }
        if(right==arr.length && count/k>=threshold)ans++;
        return ans;
    }
}
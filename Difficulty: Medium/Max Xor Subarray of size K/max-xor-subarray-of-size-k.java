class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int a=0;
        int i=0;
        for(i=0;i<k;i++){
            a=a^arr[i];
        }
        int m=0;
        m=Math.max(m,a);
        int j=0;
        for(i=i;i<arr.length;i++){
            a=a^arr[j]^arr[i];
            m=Math.max(m,a);
            j++;
        }
        return m;
    }
   
}

class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int pref[]=new int[arr.length];
        int suff[]=new int[arr.length];
        pref[0]=1;
        for(int i=1;i<arr.length;i++){
            pref[i]=pref[i-1]*arr[i-1];
        }
        suff[arr.length-1]=1;
        for(int i=arr.length-2;i>=0;i--){
            suff[i]=suff[i+1]*arr[i+1];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=pref[i]*suff[i];
        }
        return arr;
    }
}

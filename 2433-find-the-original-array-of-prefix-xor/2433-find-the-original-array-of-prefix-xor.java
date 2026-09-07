class Solution {
    public int[] findArray(int[] pref) {
        int ans[]=new int[pref.length];
        int or=0;
        for(int i=0;i<pref.length;i++){
            or=or^pref[i];
            ans[i]=or;
            or=pref[i];
        }
        return ans;
    }
}
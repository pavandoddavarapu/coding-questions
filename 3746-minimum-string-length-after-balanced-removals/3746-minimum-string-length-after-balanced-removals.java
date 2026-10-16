class Solution {
    public int minLengthAfterRemovals(String s) {
        int ans=0;
        
        for(char a: s.toCharArray()){
            if(a=='a')ans++;
            else ans--;
        }
        return Math.abs(ans);
    }
}
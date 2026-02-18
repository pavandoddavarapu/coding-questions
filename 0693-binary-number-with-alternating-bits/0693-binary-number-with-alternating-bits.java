class Solution {
    public boolean hasAlternatingBits(int n) {
        int ans=n&1;
        n=n>>1;
        while(n>0){
            if((n & 1)==1 && (ans==1))return false;
            if((n&1)==0 && ans==0)return false;
           ans=n&1;
           n= n>>1;
        }
        return true;
    }
}
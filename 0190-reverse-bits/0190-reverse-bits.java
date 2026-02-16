class Solution {
    public int reverseBits(int n) {
        int ans=0;
        int i=0;
        while(i<32){
            if((n&1)==1){ans=ans<<1;ans=ans+1;System.out.print(1+" ");}
            else{ans=ans<<1;System.out.print(0+" ");}
            i++;
            n=n>>1;
        }
        return ans;
    }
}
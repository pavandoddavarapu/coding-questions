class Solution {
    public int reachNumber(int target) {
        int ans=0;
        int count=0;
        int m=1;
        target=Math.abs(target);
        while(true){
            if(ans>=target && ((ans-target)%2==0))return count;
            ans=ans+m;
            m++;
            count++;
        }
       
    }
}
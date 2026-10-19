class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int lo=1;
        int hi=position[position.length-1]-position[0];
        int ans=0;
        while(lo<=hi){
            int mid=lo+((hi-lo)/2);
            if(helper(mid,position,m)){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
    public boolean helper(int mid,int[] p,int m){
        int last=0;
        m--;
        for(int i=1;i<p.length;i++){
            if(p[i]-p[last]>=mid){m--;last=i;}
            if(m==0)return true;

        }
        return false;
    }
}
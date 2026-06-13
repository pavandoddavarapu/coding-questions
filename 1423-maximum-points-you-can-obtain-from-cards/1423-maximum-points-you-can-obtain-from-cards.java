class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left=0;
        int right=0;
        int lsum=0;
        int rsum=0;
        for(int i=0;i<k;i++){lsum=lsum+cardPoints[i];}
        int ans=0;
        while(left<k){
            ans=Math.max(ans,lsum+rsum);
            lsum=lsum-cardPoints[k-left-1];
            rsum=rsum+cardPoints[cardPoints.length-left-1];
            left++;
        }
        ans=Math.max(ans,lsum+rsum);
        return ans;
    }
}
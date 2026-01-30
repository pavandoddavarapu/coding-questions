/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // if(n==1 && isBadVersion(n)) return 1;
        int start=1;
        int end=n;
        int ans=n;
        while(start<=end){
            int mid=start + (end - start) / 2;
            if(isBadVersion(mid)){
                ans=Math.min(ans,mid);
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
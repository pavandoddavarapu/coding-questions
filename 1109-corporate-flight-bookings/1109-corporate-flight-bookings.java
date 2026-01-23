class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[]=new int[n];
        int diff[]=new int[n+2];
        for(int i=0;i<bookings.length;i++){
            int l=bookings[i][0];
            int r=bookings[i][1];
            int d=bookings[i][2];
            diff[l]=diff[l]+d;
            diff[r+1]=diff[r+1]-d;
        }
        for(int i=1;i<diff.length;i++){
            diff[i]=diff[i-1]+diff[i];
        }
        for(int i=0;i<ans.length;i++){
            ans[i]=diff[i+1];
        }
        return ans;
    }
}
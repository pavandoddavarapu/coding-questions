class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int mass=0;
        for(int i=0;i<bloomDay.length;i++){
            mass=Math.max(mass,bloomDay[i]);
        }
        int start=1;
        int end=mass;
        int ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(helper(bloomDay,m,k,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans==Integer.MAX_VALUE? 1-2: ans;
    }
     public boolean helper(int[] bloomDay, int m, int k, int mid) {
        int bouquets = 0;
        int flowers = 0;
        
        for (int day : bloomDay) {
            if (day <= mid) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0; // Reset for next bouquet
                }
            } else {
                flowers = 0; // Adjacency broken, reset count
            }
        }
        return bouquets >= m;
    } 
}
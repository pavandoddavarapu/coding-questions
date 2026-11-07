class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->{return (a[0]-a[1])-(b[0]-b[1]);});
        int ans=0;
        int n=0;
        for(int i=0;i<costs.length;i++){
            int a=costs[i][0];
            int b=costs[i][1];
            if(n<costs.length/2){ans+=a;n++;}
            else{ans+=b;}
        }
        return ans;
    }
}
class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double ans[][]=new double[200][200];
        ans[0][0]=poured;
        int level=0;
        while(level<query_row+1){
           
            for(int i=0;i<level+1;i++){
                if(ans[level][i]>1){
                    double a=ans[level][i]-1;
                    poured=poured-1;
                    ans[level][i]=1;
                    ans[level+1][i]=ans[level+1][i]+a/2.0;
                    ans[level+1][i+1]=ans[level+1][i+1]+a/2.0;
                   
                }
            }
            level=level+1;
            
        }
        return ans[query_row][query_glass];
    }
}
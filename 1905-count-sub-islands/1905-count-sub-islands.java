class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int count=0;
        for(int i=0;i<grid1.length;i++){
            for(int j=0;j<grid1[0].length;j++){
                if(grid2[i][j]==1){
                    flag=true;
                    helper(grid1,grid2,i,j);
                    if(flag)
                    count++;
                }
            }
        }
        return count;
    }
    boolean flag=false;
    public void helper(int[][] grid1, int[][] grid2,int i,int j){
        if(grid1[i][j]!=1)flag=false;
        grid1[i][j]=0;
        grid2[i][j]=0;
        int is[]={-1,0,1,0};
        int js[]={0,1,0,-1};
        for(int k=0;k<4;k++){
        
            int a=is[k]+i;
            int b=js[k]+j;
            if(a>=0 && b>=0 && a<grid1.length && b<grid1[0].length && grid2[a][b]==1)
            {
            
            grid2[a][b]=0;
            helper(grid1,grid2,is[k]+i,js[k]+j);
            }
        }
    }
}
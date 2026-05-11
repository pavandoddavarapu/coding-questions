class Solution {
    public int numEnclaves(int[][] grid) {
        for(int i=0;i<grid[0].length;i++){
            if(grid[0][i]==1){
                dfs(grid,0,i);
            }
        }
        for(int i=0;i<grid.length;i++){
            if(grid[i][grid[0].length-1]==1){
                dfs(grid,i,grid[0].length-1);
            }
        }
        for(int i=0;i<grid[0].length;i++){
            if(grid[grid.length-1][i]==1){
                dfs(grid,grid.length-1,i);
            }
        }
        for(int i=0;i<grid.length;i++){
            if(grid[i][0]==1){
                dfs(grid,i,0);
            }
        }
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)count++;
            }
        }
        return count;
    }
    public void dfs(int grid[][],int i,int j){
        grid[i][j]=0;
        int iers[]={-1,+1,0,0};
        int jers[]={0,0,-1,+1};
        for(int k=0;k<4;k++){
            int m=i+iers[k];
            int n=j+jers[k];
            if(m>=0 && n>=0 && m<grid.length && n<grid[0].length && grid[m][n]==1 ){
                dfs(grid,m,n);
            }
        }
    }
}
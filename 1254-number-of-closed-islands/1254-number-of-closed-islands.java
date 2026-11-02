class Solution {
    public int closedIsland(int[][] grid) {
        int ans=0;
        int is[]={-1,0,1,0};
            int js[]={0,1,0,-1};
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    flag=false;
                    helper(grid,i,j,is,js);
                    if(flag==false)ans++;
                }
            }
        }
        return ans;
    }
    boolean flag=false;
    public void helper(int[][] grid,int i,int j,int is[],int js[]){
        grid[i][j]=1;

            
            for(int m=0;m<is.length;m++){
                int x=i+is[m];
                int y=j+js[m];
                if(x>=grid.length || y>=grid[0].length || x<0 || y<0){flag=true;}
                else if(grid[x][y]==0){helper(grid,x,y,is,js);}
            }
        
    }
}
class Solution {
    public int closedIsland(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    flag=false;
                    helper(grid,i,j);
                    if(flag==false)ans++;
                }
            }
        }
        return ans;
    }
    boolean flag=false;
    public void helper(int[][] grid,int i,int j){
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{i,j});
        grid[i][j]=1;
        while(!q.isEmpty()){
            int a[]=q.poll();
            int is[]={-1,0,1,0};
            int js[]={0,1,0,-1};
            for(int m=0;m<is.length;m++){
                int x=a[0]+is[m];
                int y=a[1]+js[m];
                if(x>=grid.length || y>=grid[0].length || x<0 || y<0){flag=true;}
                else if(grid[x][y]==0){q.add(new int[]{x,y});grid[x][y]=1;}
            }
        }
    }
}
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(vis[i][j]==false && grid[i][j]==1) ans=Math.max(ans,helper(grid,vis,i,j));
            }
        }
        return ans;
    }
    public int helper(int[][] grid,boolean[][] vis,int i,int j){
        vis[i][j]=true;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{i,j});
        int iss[]={-1,0,1,0};
        int jss[]={0,1,0,-1};
        int count=1;
        while(!q.isEmpty()){
            int arr[]=q.poll();
            int k=arr[0];
            int l=arr[1];
            for(int m=0;m<4;m++){
                int x=k+iss[m];
                int y=l+jss[m];
                if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && vis[x][y]==false && grid[x][y]==1){
                    q.add(new int[]{x,y});
                    vis[x][y]=true;
                    count++;
                }
            }
        }
        return count;
    }
}
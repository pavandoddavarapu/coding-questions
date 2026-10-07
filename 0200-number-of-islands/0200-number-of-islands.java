class Solution {
    public int numIslands(char[][] grid) {
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && vis[i][j]==false){
                    count++;
                    helper(grid,i,j,vis);
                }
            }
        }
        return count;
    }
    public void helper(char[][] grid,int x,int y,boolean vis[][]){
        vis[x][y]=true;
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{x,y});
        int count=0;
        while(!q.isEmpty()){
            
            int as[]=q.poll();
            int is[]={-1,0,1,0};
            int js[]={0,1,0,-1};
            for(int i=0;i<4;i++){
                int k=is[i]+as[0];
                int l=js[i]+as[1];
                if(k>=0 && k<grid.length && l>=0 && l<grid[0].length && grid[k][l]=='1' && vis[k][l]==false){
                    q.add(new int[]{k,l});
                    vis[k][l]=true;
                }
            }
        }
        
    }
}
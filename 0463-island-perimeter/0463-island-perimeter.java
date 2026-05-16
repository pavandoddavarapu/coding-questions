class Solution {

    public class pair{
        int i;int j;
        pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    public int islandPerimeter(int[][] grid) {
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    vis[i][j]=true;
                    return bfs(grid,i,j,vis);
                }
            }
        }
        return 0;
    }

    public int bfs(int[][] grid,int l,int m,boolean[][] vis){
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(l,m));
        int maxcount=0;
        while(!q.isEmpty()){
            pair p=q.poll();
            int i=p.i;
            int j=p.j;
            int iers[]={-1,1,0,0};
            int jers[]={0,0,-1,1};
            int count=0;
            for(int k=0;k<4;k++){
                int ni=i+iers[k];
                int nj=j+jers[k];
                if(ni>=0 && nj>=0 && ni<grid.length && nj<grid[0].length && grid[ni][nj]==1 && !vis[ni][nj]){
                    q.add(new pair(ni,nj));
                    vis[ni][nj]=true;

                }
               else if(ni<0 || nj<0 || ni>=grid.length || nj>=grid[0].length || grid[ni][nj]==0){
    count++;
}
            }
            maxcount=maxcount+count;
        }
        return maxcount;
    }
}
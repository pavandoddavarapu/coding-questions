class Solution {
    class pair{
            int i;
            int j;
            pair(int i,int j){
                this.i=i;
                this.j=j;
            }
        }
    public int numIslands(char[][] grid) {
        
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    bfs(grid,vis,new pair(i,j));
                }
            }
        }
        return count;
    }

    public void bfs(char[][] grid,boolean vis[][],pair p){
        Queue<pair> q=new LinkedList<>();
        q.add(p);
        vis[p.i][p.j]=true;
        while(!q.isEmpty()){
            pair p1=q.poll();
            int i=p1.i;
            int j=p1.j;
            if(p1.i-1>=0 && vis[i-1][j]==false && grid[i-1][j]=='1'){grid[i-1][j]=2;q.add(new pair(i-1,j));vis[i-1][j]=true;}
            if(p1.i+1<grid.length && vis[i+1][j]==false && grid[i+1][j]=='1'){grid[i+1][j]=2;q.add(new pair(i+1,j));vis[i+1][j]=true;}
            if(p1.j-1>=0 && vis[i][j-1]==false && grid[i][j-1]=='1'){grid[i][j-1]=2;q.add(new pair(i,j-1));vis[i][j-1]=true;}
            if(p1.j+1<grid[0].length && vis[i][j+1]==false && grid[i][j+1]=='1'){grid[i][j+1]=2;q.add(new pair(i,j+1));vis[i][j+1]=true;}
        }
    }
}
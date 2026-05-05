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
                    Queue<pair> q=new LinkedList<>();
                    pair p=new pair(i,j);
        q.add(p);
        vis[p.i][p.j]=true;
        while(!q.isEmpty()){
            pair p1=q.poll();
            if(p1.i-1>=0  && grid[p1.i-1][p1.j]=='1'){grid[p1.i-1][p1.j]=2;q.add(new pair(p1.i-1,p1.j));}
            if(p1.i+1<grid.length && grid[p1.i+1][p1.j]=='1'){grid[p1.i+1][p1.j]=2;q.add(new pair(p1.i+1,p1.j));}
            if(p1.j-1>=0 && grid[p1.i][p1.j-1]=='1'){grid[p1.i][p1.j-1]=2;q.add(new pair(p1.i,p1.j-1));}
            if(p1.j+1<grid[0].length && grid[p1.i][p1.j+1]=='1'){grid[p1.i][p1.j+1]=2;q.add(new pair(p1.i,p1.j+1));}
        }
    }
                }
            }
        
        return count;
    }

    }
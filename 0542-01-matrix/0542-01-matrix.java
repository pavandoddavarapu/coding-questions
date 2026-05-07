class Solution {
    class pair{
        int i;
        int j;
        int level;
        pair(int i,int j,int level){
            this.i=i;
            this.j=j;
            this.level=level;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        
        boolean visited[][]=new boolean[mat.length][mat[0].length];
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    q.add(new pair(i,j,0));
                    visited[i][j]=true;
                }
            }
        }
        bfs(mat,visited,q);
        return mat;
        
    }
    public void bfs(int[][] mat,boolean visited[][],Queue<pair> q){
        while(!q.isEmpty()){
            pair p=q.poll();
            int pi=p.i;
            int pj=p.j;
            int pl=p.level;
            int ier[]={-1,1,0,0};
            int jer[]={0,0,-1,1};
            mat[pi][pj]=pl;
            for(int i=0;i<4;i++){
                int row=pi+ier[i];
                int col=pj+jer[i];
                if(row>=0 && row<mat.length && col>=0 && col<mat[0].length && visited[row][col]==false){
                    q.add(new pair(row,col,pl+1));visited[row][col]=true;
                }
            }
        }

    }
}
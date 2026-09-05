class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length-1;
        boolean vis[][]=new boolean[n+1][n+1];
        if(grid[0][0]!=0 || grid[n][n]!=0)return -1;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,0,1});
        while(!q.isEmpty()){
            int[] p=q.poll();
            int pi=p[0];
            int pj=p[1];
            int pn=p[2];
            if(pi==n && pj==n)return pn;
            int is[]={-1,-1,0,1,1,1,0,-1};
            int js[]={0,1,1,1,0,-1,-1,-1};
            for(int i=0;i<8;i++){
                int ni=pi+is[i];
                int nj=pj+js[i];
                if(ni>=0 && nj>=0 && ni<=n && nj<=n && grid[ni][nj]==0 && vis[ni][nj]==false){
                    vis[ni][nj]=true;
                    q.add(new int[]{ni,nj,pn+1});
                }
            }
        }
        return -1;
    }
}
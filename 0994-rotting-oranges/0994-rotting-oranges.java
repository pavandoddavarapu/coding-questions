class Solution {
    class pair{
        int i;
        int j;
        int l;
        pair(int i,int j,int l){
            this.i=i;
            this.j=j;
            this.l=l;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<pair> q=new LinkedList<>();
        int ones=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){q.add(new pair(i,j,0));}
                if(grid[i][j]==1)ones++;
            }
        }
        int maxi=0;
        while(!q.isEmpty()){

            pair p=q.poll();
            int iers[]={-1,+1,0,0};
            int jers[]={0,0,-1,+1};
            for(int k=0;k<4;k++){
                int i=p.i+iers[k];
                int j=p.j+jers[k];
                if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]==1){grid[i][j]=2;q.add(new pair(i,j,p.l+1));ones--;}
            }
            maxi=Math.max(maxi,p.l);
        }
        if(ones==0)return maxi;
        return -1;
    }
}
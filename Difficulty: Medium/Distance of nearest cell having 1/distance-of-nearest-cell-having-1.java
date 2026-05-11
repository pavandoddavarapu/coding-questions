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
    public ArrayList<ArrayList<Integer>> nearest(int[][] grid) {
        // code here
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){q.add(new pair(i,j,0));grid[i][j]=-1; }
        }
        }
        while(!q.isEmpty()){
            pair p=q.poll();
            int iers[]={-1,1,0,0};
            int jers[]={0,0,1,-1};
            for(int k=0;k<4;k++){
                int i=p.i+iers[k];
                int j=p.j+jers[k];
                int l=p.l;
                if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]==0){
                    q.add(new pair(i,j,p.l+1));
                    grid[i][j]=p.l+1;
                }
                
            }
        }
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();

        for(int i=0;i<grid.length;i++){
            ArrayList<Integer> a=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==-1)a.add(0);
                else{a.add(grid[i][j]);}
            }
            arr.add(a);
        }
        return arr;
    }
}
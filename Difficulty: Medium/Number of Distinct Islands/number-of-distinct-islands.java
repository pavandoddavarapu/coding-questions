// User function Template for Java

class Solution {

    int countDistinctIslands(int[][] grid) {
        // Your Code here
        HashSet<ArrayList<Integer>> hs=new HashSet<>();
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    ArrayList<Integer> arr=new ArrayList<>();
                    dfs(grid,vis,i,j,arr,i,j);
                    hs.add(arr);
                }
            }
        }
        return hs.size();
    }
    public void dfs(int[][] grid,boolean[][] vis,int i1,int j1,ArrayList<Integer> arr,int k,int l){
        vis[i1][j1]=true;
        arr.add(k-i1);
        arr.add(l-j1);
        int ier[]={-1,+1,0,0};
        int jer[]={0,0,-1,+1};
        for(int i=0;i<4;i++){
            int row=i1+ier[i];
            int col=j1+jer[i];
            if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && grid[row][col]==1 && vis[row][col]==false){
                dfs(grid,vis,row,col,arr,k,l);
            }}
        return;
    }
}

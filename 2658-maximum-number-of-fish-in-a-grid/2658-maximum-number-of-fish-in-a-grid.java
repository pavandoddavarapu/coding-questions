class Solution {
    public int findMaxFish(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    ans=Math.max(ans,helper(grid,i,j));
                }
            }
        }
        return ans;
    }
    public int helper(int[][] grid,int i,int j){
        int count=0;

        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{i,j});
        int is[]={-1,0,1,0};
        int js[]={0,1,0,-1};
        count+=grid[i][j];
        grid[i][j]=0;
        while(!q.isEmpty()){
            int a[]=q.poll();
            
            for(int m=0;m<4;m++){
                int x=a[0]+is[m];
                int y=a[1]+js[m];
                if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && grid[x][y]!=0){
                    count+=grid[x][y];
                    grid[x][y]=0;
                    q.add(new int[]{x,y});
                }
            }
        }
        return count;
    }
}
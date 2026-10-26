class Solution {
    public int maxSum(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int a=i;
                int b=j;
                if(i-1>=0  && j-1>=0 && i+1<grid.length && j+1<grid[0].length){
                    ans=Math.max(ans,grid[i][j]+grid[i-1][j-1]+grid[i-1][j]+grid[i-1][j+1]+grid[i+1][j-1]+grid[i+1][j]+grid[i+1][j+1]);
                }
            }
        }
        return ans;
    }
}
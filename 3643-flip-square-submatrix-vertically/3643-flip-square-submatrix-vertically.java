class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int x1=x;
        int y1=y;
        int x2=x+k-1;
        int y2=y+k-1;
        while(x1<x2){
            for(int j=y1;j<=y2;j++){
                int temp=grid[x1][j];
                grid[x1][j]=grid[x2][j];
                grid[x2][j]=temp;
            }
            x1++;
            x2--;
        }
        return grid;
    }
}
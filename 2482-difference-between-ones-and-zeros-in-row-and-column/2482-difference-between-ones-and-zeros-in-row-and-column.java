class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row1[]=new int[grid.length];
        int col1[]=new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            int row=0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)row++;
            }
            row1[i]=row;
        }
        for(int i=0;i<grid[0].length;i++){
            int row=0;
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==1)row++;
            }
            col1[i]=row;
        }
        for(int i=0;i<grid.length;i++){
            
            for(int j=0;j<grid[0].length;j++){
               grid[i][j] = row1[i] + col1[j] - (grid[0].length - row1[i]) - (grid.length - col1[j]);

            }
            
        }
        return grid;
    }
}
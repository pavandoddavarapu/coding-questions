class Solution {
    public int minimumArea(int[][] grid) {
        int left=grid[0].length;
        int right=0;
        int up=grid[0].length;
        int down=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    left=Math.min(left,j);
                    right=Math.max(right,j);
                    up=Math.min(up,i);
                    down=Math.max(down,i);
                }
            }
        }
        // System.out.println(left);System.out.println(right);System.out.println(up);System.out.println(down);
        return (right+1-left)*(down+1-up);
    }
}
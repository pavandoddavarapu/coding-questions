class Solution {
    public int[][] generateMatrix(int n) {
        
        int mat[][]=new int[n][n];
        int left=0;
        int right=n-1;
        int up=0;
        int bottom=n-1;
        int ans=1;
        while(up<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                mat[up][i]=ans;
                ans++;
            }
            up++;
            for(int i=up;i<=bottom;i++){
                mat[i][right]=ans;
                ans++;
            }
            right--;
            for(int i=right;i>=left;i--){
                mat[bottom][i]=ans;
                ans++;
            }
            bottom--;
            for(int i=bottom;i>=up;i--){
                mat[i][left]=ans;
                ans++;
            }
            left++;
        }
        return mat;
    }
}
class Solution {
    public boolean exist(char[][] board, String word) {
        boolean vis[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    helper(board,i,j,word,1,vis);
                }
            }
        }


        return flag;
    }
    boolean flag=false;
    public void helper(char[][] board,int i,int j,String word,int a,boolean vis[][]){
        vis[i][j]=true;
        if(a==word.length() || flag){flag=true;return;}
        int ith[]={-1,0,1,0};
        int jth[]={0,1,0,-1};
        for(int k=0;k<4;k++){

            int b=i+ith[k];
            int c=j+jth[k];
            if(b>=0 && c>=0 && b<board.length && c<board[0].length && board[b][c]==word.charAt(a) && vis[b][c]==false){
                helper(board,b,c,word,a+1,vis);
            }
        }
        vis[i][j]=false;
        return;


    }
}
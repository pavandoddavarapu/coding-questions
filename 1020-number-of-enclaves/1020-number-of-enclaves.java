
class Solution {
    public class pair{
        int a;
        int b;
        pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    }

    public int numEnclaves(int[][] board) {
        boolean visited[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board[0].length;i++){
            if(!visited[0][i] && board[0][i]==1){bfs(0,i,visited,board);}
            int n=board.length-1;
            if(!visited[n][i] && board[n][i]==1){bfs(n,i,visited,board);}
        }
        for(int i=0;i<board.length;i++){
            
            if(!visited[i][0] && board[i][0]==1){bfs(i,0,visited,board);}
            int n=board[0].length-1;
            if(!visited[i][n] && board[i][n]==1){bfs(i,n,visited,board);}
        }
        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(visited[i][j]==false && board[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }


    public void bfs(int i1,int j1,boolean[][] visited,int board[][]){
        Queue<pair> q=new LinkedList<>();
        visited[i1][j1]=true;
        q.add(new pair(i1,j1));
        while(!q.isEmpty()){
            pair p=q.poll();
            int i=p.a;
            int j=p.b;
            if(i-1>=0 && board[i-1][j]==1 && !visited[i-1][j]){
                q.add(new pair(i-1,j));visited[i-1][j]=true;
            }
            if(j-1>=0 && board[i][j-1]==1 && !visited[i][j-1]){
                q.add(new pair(i,j-1));visited[i][j-1]=true;
            }
            if(i+1<board.length  && board[i+1][j]==1 && !visited[i+1][j]){
                q.add(new pair(i+1,j));visited[i+1][j]=true;
            }
            if(j+1<board[0].length && board[i][j+1]==1 && !visited[i][j+1]){
                q.add(new pair(i,j+1));visited[i][j+1]=true;
            }

        }
    }
}
class Solution {
    class pair{
        int a;
        int b;
        int level;
        pair(int a,int b,int level){this.a=a;this.b=b;this.level=level;}

    }
    public int[][] updateMatrix(int[][] mat) {
        Queue<pair> q=new LinkedList<>();
        boolean visited[][]=new boolean[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){q.add(new pair(i,j,0));visited[i][j]=true;}
            }
        }
        int ans[][]=new int[mat.length][mat[0].length];
        while(!q.isEmpty()){
            pair p=q.poll();
            int i=p.a;
            int j=p.b;
            int level=p.level;
            ans[i][j]=level;
            if(i-1>=0 && !visited[i-1][j]){q.add(new pair(i-1,j,level+1));visited[i-1][j]=true;}
            if(j-1>=0 && !visited[i][j-1]){q.add(new pair(i,j-1,level+1));visited[i][j-1]=true;}
            if(i+1<mat.length && !visited[i+1][j]){q.add(new pair(i+1,j,level+1));visited[i+1][j]=true;}
            if(j+1<mat[0].length && !visited[i][j+1]){q.add(new pair(i,j+1,level+1));visited[i][j+1]=true;}

        }
        return ans;
    }
}
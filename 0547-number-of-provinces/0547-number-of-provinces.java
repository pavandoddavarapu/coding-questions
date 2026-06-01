class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean vis[]=new boolean[isConnected.length];
        for(int i=0;i<vis.length;i++){
            if(vis[i]==false){bfs(i,vis,isConnected);count++;}
        }
        return count;
    }
    public void bfs(int k,boolean vis[],int isConnected[][]){
        Queue<Integer> q=new LinkedList<>();
        q.add(k);
        while(!q.isEmpty()){
            int a=q.poll();
            for(int i=0;i<isConnected.length;i++){
                if(isConnected[a][i]==1 && vis[i]==false){
                    q.add(i);
                    vis[i]=true;
                }
            }
        } 
    }
}
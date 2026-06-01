class Solution {
    public int isEulerCircuit(int V, int[][] adj) {
        // code here
        boolean vis[]=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        
        int b=0;
        for(int i=adj.length-1;i>=0;i--){
            if(adj[i].length==0)vis[i]=true;
            else{b=i;}
        }
        q.add(b);
        vis[b]=true;
        while(!q.isEmpty()){
            int a=q.poll();
            for(int i=0;i<adj[a].length;i++){
                if(vis[adj[a][i]]==false){q.add(adj[a][i]);
                vis[adj[a][i]]=true;}
            }
        }
        for(int i=0;i<V;i++){
            if(vis[i]==false)return 0;
        }
        int count=0;
        for(int i=0;i<adj.length;i++){
            int n=adj[i].length;
            if(n%2!=0)count++;
        }
        if(count==0)return 2;
        if(count==2)return 1;
        return 0;
    }
}
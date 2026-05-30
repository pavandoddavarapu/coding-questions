// User function Template for Java

class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        // code here
        int dist[]=new int[V];
        Arrays.fill(dist,100000000);
        dist[src]=0;
        int l=0;
        while(l<V-1){
            for(int i=0;i<edges.length;i++){
                int u=edges[i][0];
                int v=edges[i][1];
                int w=edges[i][2];
                if(dist[u] != 100000000 && dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                }
            }
            
            
            
            
            l++;
        }
        
        for(int i=0;i<edges.length;i++){
                int u=edges[i][0];
                int v=edges[i][1];
                int w=edges[i][2];
                if(dist[u] != 100000000 && dist[u]+w<dist[v]){
                    int a[]={-1};return a;
                }
            }
        
        
       
        return dist;
    }
}

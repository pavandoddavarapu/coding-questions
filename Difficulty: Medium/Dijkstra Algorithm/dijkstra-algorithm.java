class Solution {
    
    public class pair{
        int node;
        int distance;
        pair(int d,int n){
            this.distance=d;
            this.node=n;
            
        }
    }
    
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<ArrayList<ArrayList<Integer>>> arr=new ArrayList<>();
        for(int i=0;i<V;i++){
            arr.add(new ArrayList<ArrayList<Integer>>());
            
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int w=edges[i][2];
            ArrayList<Integer> a=new ArrayList<>();
            a.add(v);
            a.add(w);
            ArrayList<Integer> b=new ArrayList<>();
            b.add(u);
            b.add(w);
            arr.get(edges[i][0]).add(a);
            arr.get(edges[i][1]).add(b);
            
        }
        PriorityQueue<pair> pq=new PriorityQueue<>((x,y)->x.distance-y.distance);
        pq.add(new pair(0,src));
        
        int dist[]=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        while(!pq.isEmpty()){
            pair p=pq.poll();
            Integer node=p.node;
            Integer distance=p.distance;
            int n=arr.get(node).size();
            for(int i=0;i<n;i++){
                int weight=arr.get(node).get(i).get(1);
                int adjNode=arr.get(node).get(i).get(0);
                if(weight+distance<dist[adjNode]){
                    dist[adjNode]=weight+distance;
                    pq.add(new pair(weight+distance,adjNode));
                }
            }
        }
        return dist;
    }
}
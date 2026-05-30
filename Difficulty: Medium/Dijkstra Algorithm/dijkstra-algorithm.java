class Solution {
    class pair{
        int distance;
        int node;
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
            int a=edges[i][0];
            int b=edges[i][1];
            int w=edges[i][2];
            ArrayList<Integer> ad=new ArrayList<Integer>();
            ad.add(b);
            ad.add(w);
            arr.get(a).add(ad);
            ArrayList<Integer> bd=new ArrayList<Integer>();
            bd.add(a);
            bd.add(w);
            arr.get(b).add(bd);
        }
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<pair> pq=new PriorityQueue<>((x,y)-> x.distance-y.distance);
        pq.add(new pair(0,src));
        dist[src]=0;
        while(!pq.isEmpty()){
            pair p=pq.poll();
            int node=p.node;
            int distance=p.distance;
            int n=arr.get(node).size();
            if(distance>dist[node]){continue;}
            for(int i=0;i<n;i++){
                int nm=arr.get(node).get(i).get(0);
                int w=arr.get(node).get(i).get(1);
                if(distance+w<dist[nm]){
                    dist[nm]=distance+w;
                    pq.add(new pair(distance+w,nm));
                }
            }
        }
        return dist;
    }
}
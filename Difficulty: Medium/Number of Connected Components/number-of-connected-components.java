class Solution {
    int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
        // code here
        int count=0;
        boolean vis[]=new boolean[V];
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<V;i++){
            arr.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edges.size();i++){
            int u=edges.get(i).get(0);
            int v=edges.get(i).get(1);
            arr.get(u).add(v);
            arr.get(v).add(u);
            
        }
        for(int i=0;i<vis.length;i++){
            if(vis[i]==false){
                bfs(i,arr,vis);count++;
            }
        }
        return count;
    }
    public void bfs(int i,ArrayList<ArrayList<Integer>> arr,boolean vis[]){
        vis[i]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int a=q.poll();
            for(int j=0;j<arr.get(a).size();j++){
                int b=arr.get(a).get(j);
                if(vis[b]==false){
                    q.add(b);
                    vis[b]=true;
                }
            }
        }
    }
}
class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<V;i++){
            arr.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edges.length;i++){
            arr.get(edges[i][0]).add(edges[i][1]);
        }
        boolean vis[]=new boolean[V];
        boolean path_vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(dfs(i,vis,path_vis,arr)==true)return true;
            }
        }
        return false;
    }
    public boolean dfs(int v,boolean[] vis,boolean[] path_vis,ArrayList<ArrayList<Integer>> arr){
        vis[v]=true;
        path_vis[v]=true;
        int n=arr.get(v).size();
        for(int i=0;i<n;i++){
            int a=arr.get(v).get(i);
            if(vis[a]==false){
                if(dfs(a,vis,path_vis,arr)){return true;}
            }
            else if(path_vis[a]==true){
                return true;
            }
        }
        path_vis[v]=false;
        return false;
    }
}
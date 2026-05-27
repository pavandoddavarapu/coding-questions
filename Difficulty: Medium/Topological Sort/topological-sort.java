class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<V;i++){
            arr.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edges.length;i++){
            arr.get(edges[i][0]).add(edges[i][1]);
        }
        boolean vis[]=new boolean[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                dfs(i,vis,arr,st);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!st.isEmpty())ans.add(st.pop());
        return ans;
    }
    public void dfs(int v,boolean vis[],ArrayList<ArrayList<Integer>> arr,Stack<Integer> st){
        vis[v]=true;
        int n=arr.get(v).size();
        for(int i=0;i<n;i++){
            int a=arr.get(v).get(i);
            if(vis[a]==false){
                dfs(a,vis,arr,st);
            }
        }
        st.add(v);
      
        return;
    }
}
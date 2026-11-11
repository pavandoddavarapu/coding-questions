class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        curr.add(0);
        dfs(0,graph.length-1,graph,ans,curr);
        return ans;
    }
    public void dfs(int src,int dest,int[][] graph,List<List<Integer>> ans,List<Integer> curr){
        if(src==dest){ans.add(new ArrayList<Integer>(curr));return;}
        for(int a:graph[src]){
            curr.add(a);
            dfs(a,dest,graph,ans,curr);
            curr.remove(curr.size()-1);
        }
    }
}
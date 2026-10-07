class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){arr.add(new ArrayList<>());}
        for(int[] a:edges){
            int u=a[0];
            int v=a[1];
            arr.get(u).add(v);
            arr.get(v).add(u);
        } 

        boolean vis[]=new boolean[n];
        return helper(edges,source,destination,vis,arr);
        
    }
    boolean ass=false;
    public boolean helper(int[][] edges, int s, int d,boolean vis[],ArrayList<ArrayList<Integer>> arr){
        if(s==d){return true;}
        vis[s]=true;
        
        for(int i=0;i<arr.get(s).size();i++){
            int a=arr.get(s).get(i);
            if(vis[a]==false && ass==false && helper(edges,a,d,vis,arr)){
                return true;
            }
            
        }
        return false;
    }
}
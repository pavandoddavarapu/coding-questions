class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        if(source==destination)return true;
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
        
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        vis[s]=true;
        while(!q.isEmpty()){
            int a=q.poll();
            for(int i=0;i<arr.get(a).size();i++){
                int b=arr.get(a).get(i);
                if(vis[b]==false){q.add(b);vis[b]=true;}
                if(b==d)return true;
            }
        }
        return false;
    }
}
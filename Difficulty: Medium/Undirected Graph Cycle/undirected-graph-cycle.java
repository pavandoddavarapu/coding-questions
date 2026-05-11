class Solution {
    public class pair{
        int a;
        int parent;
        pair(int a,int p){
            this.a=a;
            this.parent=p;
        }
    }
    public boolean isCycle(int V, int[][] mat) {
        // Code here
        
        
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<V;i++){
            arr.add(new ArrayList<Integer>());
        }
        for(int i=0;i<mat.length;i++){
            arr.get(mat[i][0]).add(mat[i][1]);
            arr.get(mat[i][1]).add(mat[i][0]);
        }
        int vis[]=new int[V];
        Arrays.fill(vis,-1);
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<vis.length;i++){
            if(vis[i]==-1){
                q.add(new pair(i,-1));
                vis[i]=-2;
                while(!q.isEmpty()){
                    pair p=q.poll();
                    for(int j=0;j<arr.get(p.a).size();j++){
                        int a=arr.get(p.a).get(j);
                        if(vis[a]==-1){q.add(new pair(a,p.a));vis[a]=p.a;}
                        else if(a!=p.parent)return true;
                    }
                }
                
            }
        }
        return false;
    }
}
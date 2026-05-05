class Solution {
    
    public boolean isBipartite(int[][] graph) {

        int color[]=new int[graph.length];
        Arrays.fill(color,-1);
        Queue<Integer> q=new LinkedList<>();
        for(int k=0;k<graph.length;k++){
            if(color[k]==-1){
        q.add(k);
        color[k]=1;
        while(!q.isEmpty()){
            int p=q.poll();
            for(int i=0;i<graph[p].length;i++){
                int a=graph[p][i];
                if(color[a]==-1){
                    q.add(a);
                    if(color[p]==1){color[a]=2;}
                    else{color[a]=1;}
                }
                else{
                    if(color[p]==color[a])return false;
                }
            }
            
        }}}
        return true;
    }
    
}
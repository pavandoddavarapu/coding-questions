class Solution {
    public boolean isBipartite(int[][] graph) {
        int color[]=new int[graph.length];
        Arrays.fill(color,-1);
        Queue<Integer> q=new LinkedList<>();
        
        for(int m=0;m<color.length;m++){
            if(color[m]==-1){
                q.add(m);
        color[m]=1;
            }
        while(!q.isEmpty()){
            int a=q.poll();
                for(int i=0;i<graph[a].length;i++){
                    if(color[graph[a][i]]==-1){
                        if(color[a]==1){color[graph[a][i]]=2;}
                        else{color[graph[a][i]]=1;}
                        q.add(graph[a][i]);
                    }
                    else{
                        if(color[graph[a][i]]==color[a])return false;
                    }

                }
            }}
        return true;
    }
}
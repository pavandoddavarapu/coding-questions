class Solution {
    public boolean isBipartite(int[][] graph) {
        int colors[]=new int[graph.length];
        Arrays.fill(colors,-1);
        for(int j=0;j<graph.length;j++){
            Queue<Integer> q=new LinkedList<>();
            if(colors[j]==-1){
                colors[j]=1;
                q.add(j);
            }
            while(!q.isEmpty()){
                int a=q.poll();
                for(int i=0;i<graph[a].length;i++){
                    if(colors[graph[a][i]]==-1){
                        if(colors[a]==1){
                            colors[graph[a][i]]=2;
                            
                        }
                        else{
                            colors[graph[a][i]]=1;
                        }
                        q.add(graph[a][i]);
                    }
                    else{
                        if(colors[graph[a][i]]==colors[a])return false;
                    }
                }
            }
        }
        return true;
    }
}
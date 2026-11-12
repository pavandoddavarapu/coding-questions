class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int ans[]=new int[n];
        for(List<Integer> e: edges){
            ans[e.get(1)]++;
        }
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(ans[i]==0)ls.add(i);
        }
        return ls;
    }
}
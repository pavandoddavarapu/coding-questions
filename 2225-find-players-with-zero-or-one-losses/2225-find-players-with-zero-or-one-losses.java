class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int a[]:matches){
            hs.add(a[0]);

        }
        for(int a[]:matches)hs.remove(a[1]);

        for(int a[]:matches){
            int b=a[1];
            hm.put(b,hm.getOrDefault(b,0)+1);
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        for(int a:hs)ans.get(0).add(a);
        ans.add(new ArrayList<>());
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue()==1)ans.get(1).add(entry.getKey());
        }
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));
        return ans;
    }
}
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int m=0;
        for(int a:nums){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        List<List<Integer>> ans=new ArrayList<>();
        while(!hm.isEmpty()){
            List<Integer> arr=new ArrayList<>();
            arr.addAll(hm.keySet());
            hm.replaceAll((k,v)->v-1);
            hm.values().removeIf(val-> val<=0);
        ans.add(arr);}
        return ans;
    }
}
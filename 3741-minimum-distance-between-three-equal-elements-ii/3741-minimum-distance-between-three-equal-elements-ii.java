class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        int z=0;
        for(int a:nums){
            if(!hm.containsKey(a)){
                hm.put(a,new ArrayList<Integer>());
            }
            hm.get(a).add(z);
            z++;
        }
        int ans=Integer.MAX_VALUE;
        for(Map.Entry<Integer,ArrayList<Integer>> entry:hm.entrySet()){
            if(entry.getValue().size()<3)continue;

            for(int f=0;f<entry.getValue().size()-2;f++){
            int i=entry.getValue().get(f);
            int j=entry.getValue().get(f+1);
            int k=entry.getValue().get(f+2);
            ans=Math.min(ans,Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i));}
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
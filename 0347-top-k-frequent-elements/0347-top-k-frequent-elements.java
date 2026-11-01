class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a:nums)hm.put(a,hm.getOrDefault(a,0)+1);
        PriorityQueue<Integer> pq=new PriorityQueue((b,a)->{
            int c=hm.get(a);
            int d=hm.get(b);
            return c-d;
        });
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            pq.add(entry.getKey());
        }
        int i=0;
        int ans[]=new int[k];
        while(i<k){
            ans[i]=pq.poll();i++;
        }
        return ans;
    }
}
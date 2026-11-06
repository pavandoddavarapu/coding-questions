class Solution {
    class pair{
        int a;
        int count;
        pair(int a,int count){
            this.a=a;
            this.count=count;
        }
    }
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a:arr){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->{return a.count-b.count;});
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            pq.add(new pair(entry.getKey(),entry.getValue()));
        }
        while(k>0){
            pair p=pq.poll();
            if(p.count<=k)k=k-p.count;
            else{
                return pq.size()+1;
            }
        }
        return pq.size();
    }
}
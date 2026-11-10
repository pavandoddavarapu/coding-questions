class Solution {
    public class pair{
        int a;
        long idx;
        public pair(int a,long idx){
            this.a=a;
            this.idx=idx;
        }
    }
    public long findScore(int[] nums) {
        boolean vis[]=new boolean[nums.length];
        PriorityQueue<pair> pq=new PriorityQueue<>((p,q)->{
            if(p.a!=q.a)return Long.compare(p.a, q.a);
            else return Long.compare(p.idx, q.idx);
        });
        int f=0;
        for(int a:nums){
            pq.add(new pair(a,f));f++;
        }
        long score=0;
        while(!pq.isEmpty()){
            pair p=pq.poll();
            if(vis[(int)p.idx])continue;
            else{
                vis[(int)p.idx]=true;
                if(p.idx-1>=0)vis[(int)p.idx-1]=true;
                if(p.idx+1<nums.length)vis[(int)p.idx+1]=true;
                score+=p.a;
            }
        }
        return score;
    }
}
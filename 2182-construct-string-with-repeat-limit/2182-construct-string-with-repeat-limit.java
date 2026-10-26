class Solution {
    public class pair{
        char c;
        int count;
        pair(char c,int count){
            this.count=count;
            this.c=c;
        }
    }
    public String repeatLimitedString(String s, int repeatLimit) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
       PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->Character.compare(b.c,a.c));
       for(Map.Entry<Character,Integer> entry:hm.entrySet()){
        pq.add(new pair(entry.getKey(),entry.getValue()));
       }
       StringBuilder sb=new StringBuilder();
       while(!pq.isEmpty()){
        pair p=pq.poll();
        int a=p.count;
        if(a>repeatLimit){p.count=p.count-repeatLimit;a=repeatLimit;}
        else{p.count=0;}
        int i=0;
        while(i<a){
            sb.append(p.c+"");i++;
        }
        if(p.count!=0 && !pq.isEmpty()){
            pair q=pq.poll();
            sb.append(q.c);
            q.count=q.count-1;
            if(q.count!=0)pq.add(q);
            pq.add(p);
        }
       }
        return sb.toString();
    }
}
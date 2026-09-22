class Solution {
    public class pair{
        char c;
        int count;
        pair(char c,int count){
            this.c=c;
            this.count=count;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->b.count-a.count);
        for(Map.Entry<Character,Integer> entry: hm.entrySet()){
            pq.add(new pair(entry.getKey(),entry.getValue()));
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            pair p=pq.poll();
            int i=0;
            while(i<p.count){
                sb.append(p.c+"");
                i++;
            }
        }
        return sb.toString();

    }
}
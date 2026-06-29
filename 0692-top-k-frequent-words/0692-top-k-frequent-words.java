class Solution {
    public class pair{
        int n;
        String st;
        pair(int n,String st){
            this.n=n;
            this.st=st;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hm=new HashMap<>();
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<words.length;i++){
            hm.put(words[i],hm.getOrDefault(words[i],0)+1);
            
        }
        
        PriorityQueue<pair> pq=new PriorityQueue<>((p,q)->{
            if(p.n!=q.n){return q.n-p.n;}
            return p.st.compareTo(q.st);
        });
        for(int i=0;i<words.length;i++){
            if(!hs.contains(words[i])){
                pq.add(new pair(hm.get(words[i]),words[i]));hs.add(words[i]);
            }
        }
        List<String> ls=new ArrayList<>();
        int i=0;
        while(i<k){
            pair p=pq.poll();
            ls.add(p.st);
            i++;
        }
        return ls;
    }
}
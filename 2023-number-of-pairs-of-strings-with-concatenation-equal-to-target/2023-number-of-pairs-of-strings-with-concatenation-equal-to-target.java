class Solution {
    public int numOfPairs(String[] nums, String target) {
        HashMap<String,Integer> hs=new HashMap<>();
        int count=0;
        for(String st:nums){
           
           if(target.startsWith(st)){
            String t=target.substring(st.length(),target.length());
             if(hs.containsKey(t)){
                count=count+hs.get(t);
             }
           }
           if(target.endsWith(st)){
            String t=target.substring(0,target.length()-st.length());
             if(hs.containsKey(t)){
                count=count+hs.get(t);
             }
           }
           hs.put(st,hs.getOrDefault(st,0)+1);
        }
        return count;
    }
}
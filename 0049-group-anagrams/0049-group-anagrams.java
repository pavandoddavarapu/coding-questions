class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        if(strs.length==0)return ans;
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            int count[]=new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int a:count){sb.append(a+".");}
           
            if(!hm.containsKey(sb.toString())){
                hm.put(sb.toString(),new ArrayList<>());
                
            }
            hm.get(sb.toString()).add(s);
        }
        for(Map.Entry<String,List<String>> entry: hm.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
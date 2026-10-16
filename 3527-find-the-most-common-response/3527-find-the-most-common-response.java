class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> hm=new HashMap<>();

        for(List<String> ls: responses){
            HashSet<String> hs=new HashSet<>();
            for(String st: ls){
                if(!hs.contains(st)){
                    hm.put(st,hm.getOrDefault(st,0)+1);
                    hs.add(st);
                }

            }
        }
        ArrayList<String> arr=new ArrayList<>();
        int ma=0;
        String ans="zzz";
        for(Map.Entry<String,Integer> entry: hm.entrySet()){
            if(entry.getValue()>ma)ma=entry.getValue();
        }
        for(Map.Entry<String,Integer> entry: hm.entrySet()){
            if(entry.getValue()==ma)arr.add(entry.getKey());
        }
        Collections.sort(arr);
        if(arr.size()==0)return "";
        return arr.get(0);
    }
}
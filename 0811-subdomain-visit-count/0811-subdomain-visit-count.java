class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> ls=new ArrayList<>();
        HashMap<String,Integer> hm=new HashMap<>();
        for(String s:cpdomains){
            String srr[]=s.split(" ");
            String lrr[]=srr[1].split("\\.");
            int a=Integer.parseInt(srr[0]);
            if(hm.containsKey(srr[1])){
                    hm.put(srr[1],hm.get(srr[1])+a);
                }
                else{
                    hm.put(srr[1],a);
                }
            if(lrr.length==2){
                if(hm.containsKey(lrr[1])){
                    hm.put(lrr[1],hm.get(lrr[1])+a);
                }
                else{
                    hm.put(lrr[1],a);
                }
            }
            else{
                if(hm.containsKey(lrr[2])){
                    hm.put(lrr[2],hm.get(lrr[2])+a);
                }
                else{
                    hm.put(lrr[2],a);
                }
                if(hm.containsKey(lrr[1]+"."+lrr[2])){
                    hm.put(lrr[1]+"."+lrr[2],hm.get(lrr[1]+"."+lrr[2])+a);
                }
                else{
                    hm.put(lrr[1]+"."+lrr[2],a);
                }
            }
        }
        for(Map.Entry<String,Integer> entry:hm.entrySet()){
            ls.add(entry.getValue()+" "+entry.getKey());
        }
        return  ls;
    }
}
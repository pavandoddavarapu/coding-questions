class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a:nums){hm.put(a,hm.getOrDefault(a,0)+1);}
        HashSet<Integer>hs=new HashSet<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(hs.contains(entry.getValue())){
                arr.add(entry.getValue());
            }
            else{hs.add(entry.getValue());}
            
        }
        for(int a:arr){
            if(hs.contains(a))hs.remove(a);
        }
        for(int a:nums){
            if(hs.contains(hm.get(a)))return a;

        }
        return -1;
    }
}
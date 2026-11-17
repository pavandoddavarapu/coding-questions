class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a:nums){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        int a=nums.length/3;
        List<Integer> ls=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue()>a)ls.add(entry.getKey());
        }
        return ls;
    }
}
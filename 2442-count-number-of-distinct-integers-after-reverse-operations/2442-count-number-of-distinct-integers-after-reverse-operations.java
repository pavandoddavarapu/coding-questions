class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<String> hs=new HashSet<>();
        for(int a:nums){
            StringBuilder sb=new StringBuilder(a+"");
            hs.add(sb.toString());
            hs.add(Integer.parseInt(sb.reverse().toString())+"");
        }
        return hs.size();
    }
}
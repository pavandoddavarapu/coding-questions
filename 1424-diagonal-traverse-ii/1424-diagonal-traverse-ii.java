class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        TreeMap<Integer,ArrayList<Integer>> hm=new TreeMap<>();
        int ma=0;
        int k=0;
        for(int i=nums.size()-1;i>=0;i--){
            for(int j=nums.get(i).size()-1;j>=0;j--){
                int a=nums.get(i).get(j);
                if(!hm.containsKey(i+j)){
                    hm.put(i+j,new ArrayList<>());
                }
                hm.get(i+j).add(a);
            }
            k+=nums.get(i).size();
        }
        int ans[]=new int[k];
        int i=0;
        for(Map.Entry<Integer,ArrayList<Integer>> entry:hm.entrySet()){
            ArrayList<Integer> arr=entry.getValue();
            for(int j=0;j<arr.size();j++){
                ans[i++]=arr.get(j);
            }
        }
        return ans;
    }
}
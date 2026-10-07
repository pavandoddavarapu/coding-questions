class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            int a=groupSizes[i];
            if(!hm.containsKey(a)){
                hm.put(a,new ArrayList<Integer>());
            }
            hm.get(a).add(i);
            if(hm.get(a).size()==a){
                 ArrayList<Integer> arr=hm.get(a);
                List<Integer> ls=new ArrayList<>();
                for(int ak:arr){
                ls.add(ak);
                
            }
            ans.add(ls);
            arr.clear();
            }
        }
        
        return ans;
    }
}
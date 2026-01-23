
class Solution {
    public ArrayList<Integer> topKFreq(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }    
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<nums.length+1;i++){
            arr.add(new ArrayList<Integer>());
        }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            arr.get(entry.getValue()).add(entry.getKey());
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int j=0;
        for(int i=arr.size()-1;i>=0;i--){
            ArrayList<Integer> t=arr.get(i);
            if(!t.isEmpty()){
                int[] t1=t.stream()
                                   .mapToInt(w -> w) // or .mapToInt(Integer::intValue)
                                   .toArray();
                
                Arrays.sort(t1);
                for(int m=t1.length-1;m>=0;m--){

                if(j<k){
                    ans.add(t1[m]);
                    j++;
                }
                else{return ans;}
                }
            }
            }
        
        return ans;
        }
}
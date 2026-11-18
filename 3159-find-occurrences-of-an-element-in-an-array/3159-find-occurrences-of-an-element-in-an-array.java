class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x)arr.add(i);
        }
        int n=arr.size();
        int j=0;
        for(int i=0;i<queries.length;i++){
            if(queries[i]<=n){
                queries[i]=arr.get(queries[i]-1);
            }
            else{queries[i]=-1;}
        }
        return queries;
    }
}
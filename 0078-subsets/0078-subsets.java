class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,0,arr,ans);
        return ans;
    }
    public void helper(int[] nums,int i,ArrayList<Integer> arr,List<List<Integer>> ans){
        if(i==nums.length){ans.add(new ArrayList(arr));return;}
        arr.add(nums[i]);
        helper(nums,i+1,arr,ans);
        arr.remove(arr.size()-1);
        helper(nums,i+1,arr,ans);
        return;
    }
}
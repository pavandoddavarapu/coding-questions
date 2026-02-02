class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> arr=new ArrayList<>(hm.values());
        Collections.sort(arr,Collections.reverseOrder());
        int a=arr.get(0);
        int count=0;
        for(int e: arr){
            System.out.print(e+" ");
            if(e==a)count=count+a;
            else break;
        }
        return count;
    }
}
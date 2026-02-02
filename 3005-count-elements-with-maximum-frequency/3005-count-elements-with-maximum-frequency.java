class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> arr=new PriorityQueue<>(Comparator.reverseOrder());
        arr.addAll(hm.values());
        int a=arr.poll();
        int count=a;
        int c=arr.size();
        for(int i=0;i<c;i++){
            int e=arr.poll();
            System.out.print(e+" ");
            if(e==a)count=count+a;
            else break;
            
        }
        return count;
    }
}
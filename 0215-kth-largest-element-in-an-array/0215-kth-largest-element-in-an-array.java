class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i=0;
        while(i<k){
            pq.add(nums[i]);
            i++;
        }
        for(int j=i;j<nums.length;j++){
            pq.add(nums[j]);
            pq.poll();
        }
        return pq.poll();
    }
}
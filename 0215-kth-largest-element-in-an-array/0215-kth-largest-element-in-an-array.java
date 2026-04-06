class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int a: nums){
            pq.add(a);
        }
        int i=0;
        while(i<nums.length-k){
            pq.poll();i++;
        }
        return pq.poll();
    }
}
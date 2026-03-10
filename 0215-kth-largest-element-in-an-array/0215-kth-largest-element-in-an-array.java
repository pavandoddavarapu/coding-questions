import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // A min-heap (default for PriorityQueue in Java)
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        
        for (int a : nums) {
            pq.add(a);
            // If the heap size exceeds k, remove the smallest element (the root)
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        // The root of the min-heap will be the k-th largest element
        return pq.poll();
    }
}

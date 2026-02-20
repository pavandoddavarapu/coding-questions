import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Create a Min-Heap (default) to store the k largest elements.
        // Or, use a Max-Heap with reverseOrder and poll k times.
        
        // Option 1: Using a Max-Heap (as in the original code's intent)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int num : nums) {
            maxHeap.add(num);
        }
        
        int result = 0;
        // Poll k-1 times to reach the Kth largest element
        for (int i = 0; i < k; i++) {
            result = maxHeap.poll();
        }
        
        return result;
    }
}

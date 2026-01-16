class Solution {
    public int minMen(int arr[]) {
        int n = arr.length;
        // maxReach[i] stores the farthest index we can reach starting at or before index i
        int[] maxReach = new int[n];
        for (int i = 0; i < n; i++) {
            maxReach[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                int left = Math.max(0, i - arr[i]);
                int right = Math.min(n - 1, i + arr[i]);
                // Update the start position with the maximum possible reach
                maxReach[left] = Math.max(maxReach[left], right);
            }
        }

        int count = 0;
        int currentEnd = -1; // Current coverage end
        int farthest = -1;    // Farthest coverage possible with one more person

        // Special case: check if the very first hour (0) can be covered
        if (maxReach[0] == -1 && n > 0) {
            // Check if any person starting at 0 was found. 
            // If not, we still need to check if a person at index > 0 covers 0.
            // Our preprocessing maxReach[left] already handles this.
            // But we must ensure farthest is updated before we start the loop.
        }

        for (int i = 0; i < n; i++) {
            // Update the global farthest we can reach using any person covering this index
            farthest = Math.max(farthest, maxReach[i]);

            // If we've reached the end of the current person's coverage
            if (i > currentEnd) {
                // If the farthest person we found can't even reach the current index
                if (farthest < i) {
                    return -1;
                }
                // Select the person who gave us 'farthest'
                count++;
                currentEnd = farthest;
                
                // If we already covered the whole day, stop
                if (currentEnd >= n - 1) {
                    return count;
                }
            }
        }

        return (currentEnd >= n - 1) ? count : -1;
    }
}

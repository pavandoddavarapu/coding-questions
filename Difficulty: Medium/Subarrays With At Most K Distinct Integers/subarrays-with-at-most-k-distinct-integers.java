import java.util.HashMap;

class Solution {
    public int countAtMostK(int arr[], int k) {
        if (k == 0) return 0;

        HashMap<Integer, Integer> freq = new HashMap<>();
        int left = 0, ans = 0;

        for (int right = 0; right < arr.length; right++) {
            freq.put(arr[right], freq.getOrDefault(arr[right], 0) + 1);

            while (freq.size() > k) {
                freq.put(arr[left], freq.get(arr[left]) - 1);
                if (freq.get(arr[left]) == 0) {
                    freq.remove(arr[left]);
                }
                left++;
            }

            ans += right - left + 1;
        }

        return ans;
    }

    public int subarraysWithKDistinct(int arr[], int k) {
        return countAtMostK(arr, k) - countAtMostK(arr, k - 1);
    }
}

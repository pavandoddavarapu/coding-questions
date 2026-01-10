
class Solution {
    public int countSubstr(String s, int k) {
        // Exactly k = at most k - at most (k-1)
        return countAtMostK(s, k) - countAtMostK(s, k - 1);
    }

    // Helper function to count substrings with at most k distinct characters
    private int countAtMostK(String s, int k) {
        if (k == 0) return 0;

        int left = 0;
        int result = 0;

        int[] freq = new int[26]; // frequency of characters
        int distinctCount = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If character is new in window
            if (freq[currentChar - 'a'] == 0) {
                distinctCount++;
            }
            freq[currentChar - 'a']++;

            // Shrink window if distinct characters exceed k
            while (distinctCount > k) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'a']--;

                if (freq[leftChar - 'a'] == 0) {
                    distinctCount--;
                }
                left++;
            }

            // All substrings ending at 'right'
            result += (right - left + 1);
        }

        return result;
    }
}

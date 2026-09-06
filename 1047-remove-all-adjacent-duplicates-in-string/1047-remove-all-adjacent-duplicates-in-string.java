class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int len = ans.length();
            // If stack is not empty and the current char matches the last char, pop it
            if (len > 0 && ans.charAt(len - 1) == c) {
                ans.deleteCharAt(len - 1);
            } else {
                ans.append(c);
            }
        }
        
        return ans.toString();
    }
}

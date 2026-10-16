class Solution {
    public int minSteps(String s, String t) {
        int[] ans=new int[26];
        for(char a:s.toCharArray())ans[a-'a']++;
        for(char a:t.toCharArray())ans[a-'a']--;
        int count=0;
        for(int i=0;i<26;i++){
            count=count+Math.abs(ans[i]);
        }
        return count;
    }
}
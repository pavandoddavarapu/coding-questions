class Solution {
    public int lengthOfLongestSubstring(String st) {
        int s=0;
        int e=0;
        int currsum=0;
        int ans=0;
        HashSet<Character> hs=new HashSet<>();
        while(e<st.length()){
            if(hs.add(st.charAt(e))){
                currsum++;
                ans=Math.max(ans,currsum);
                e++;
            }
            else{
                hs.remove(st.charAt(s));
                currsum--;
                s++;
                ans=Math.max(ans,currsum);
            }
        }
        return ans;
    }
}
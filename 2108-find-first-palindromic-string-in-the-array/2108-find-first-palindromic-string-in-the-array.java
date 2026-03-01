class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            StringBuilder st=new StringBuilder(words[i]);
            st.reverse();
            String s=new String(st);
            if(words[i].equals(s))return words[i];
        }
        String s="";
        return s;
    }
}
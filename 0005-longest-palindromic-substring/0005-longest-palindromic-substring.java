class Solution {
    public String longestPalindrome(String s) {
        String ans= s.charAt(0)+"";
        int maxlen=1;
        for(int i=0;i<s.length();i++){
            for(int j=s.length();j>i;j--){
                if(palindrome(s.substring(i,j))){if(j-i>maxlen){ans=s.substring(i,j);maxlen=j-i;}}
            }
        }
        return ans;
    }
    public boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;j--;
        }
        return true;
    }
}
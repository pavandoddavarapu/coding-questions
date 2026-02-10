class Solution {
    public int maxDistinct(String s) {
        char[] a=s.toCharArray();
        int ch[]=new int[26];
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(ch[a[i]-'a']==0)ans++;
            ch[a[i]-'a']++;
        }

        return ans;
    }
}
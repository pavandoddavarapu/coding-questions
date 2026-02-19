class Solution {
    public int maxVowels(String s, int k) {
        char st[]=s.toCharArray();
        int count=0;
        int ans=0;
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        ans=count;
        for(int i=k;i<s.length();i++){
            char c=s.charAt(i-k);
            if(c=='a' || c=='e' || c== 'i' || c== 'o' ||  c=='u'){
                count--;
            }
            c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
            ans=Math.max(count,ans);
        }
        return ans;
    }
}
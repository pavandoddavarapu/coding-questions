class Solution {
    public String smallestPalindrome(String s) {
        int arr[]=new int[26];
        for(char a:s.toCharArray())arr[a-'a']++;
        char ans[]=new char[s.length()];
        int n=ans.length;
        int j=0;
        int k=ans.length-1;
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            char c=(char)('a'+i);
            
            if(a%2!=0){
                ans[ans.length/2]=c;a--;
            }
            while(a>0){
                ans[j]=c;a=a-2;
                ans[k]=c;
                j++;k--;
                
            }
        }
        return new String(ans);
    }
}
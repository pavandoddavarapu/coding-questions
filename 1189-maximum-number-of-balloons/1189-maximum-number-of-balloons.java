class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[]=new int[26];
        Arrays.fill(arr,-1);
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(c=='b' || c=='a' || c=='l' || c=='o' || c=='n'){
            if(arr[c-'a']==-1)arr[c-'a']=0;
            int a=text.charAt(i)-'a';
            arr[a]++;}
        }
        arr['l'-'a']=arr['l'-'a']/2;
        arr['o'-'a']=arr['o'-'a']/2;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(arr[i]!=-1)ans=Math.min(ans,arr[i]);
            else if(i=='b'-'a' || i=='a'-'a' || i=='l'-'a' || i=='o'-'a' || i=='n'-'a')return 0;
            
        }
        if(ans==Integer.MAX_VALUE)return 0;
        return ans;
    }
}
class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0;
        int count=0;
        for(int i=0;i<bank.length;i++){
            char s[]=bank[i].toCharArray();
            int currcount=0;
            for(int j=0;j<bank[i].length();j++){
                if(s[j]=='1')currcount++;
            }
            int a=currcount*count;
            if(currcount!=0)count=currcount;
            ans=ans+a;
        }
        return ans;
    }
}
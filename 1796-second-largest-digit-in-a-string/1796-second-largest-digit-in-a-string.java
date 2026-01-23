class Solution {
    public int secondHighest(String s) {
        int first=-1;
        int second=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'){
                int a=c-'0';
                if(a>first){
                    second=first;
                    first=a;
                }
                if(a>second && a<first){second=a;}
            }
        }
        return second;
    }
}
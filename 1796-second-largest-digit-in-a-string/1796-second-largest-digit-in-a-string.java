class Solution {
    public int secondHighest(String s) {
        int first=-1;
        int second=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
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
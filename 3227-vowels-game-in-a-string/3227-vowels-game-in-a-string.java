class Solution {
    public boolean doesAliceWin(String s) {
        int count=0;
        char[] c=s.toCharArray();
        for(char ch: c){
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o' || ch=='u')count++;
        }
        if(count>=1)return true;
        else return false;


    }
}
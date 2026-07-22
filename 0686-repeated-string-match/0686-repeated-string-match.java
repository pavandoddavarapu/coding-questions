class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder st=new StringBuilder(a);
        if(a.equals(b))return 1;
        int count=1;
        while(st.indexOf(b)== -1 && count<=Math.abs(b.length()-a.length())+1){count=count+1;st.append(a);}
        return st.indexOf(b)==-1?-1:count;
    }
}
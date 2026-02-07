class Solution {
    public String reversePrefix(String s, int k) {
        char[] c=s.toCharArray();
        int i=0;
        int j=k-1;
        while(i<j){
            char ch=c[i];
            c[i]=c[j];
            c[j]=ch;
            i++;
            j--;
        }
        StringBuilder st=new StringBuilder();
        for(int m=0;m<c.length;m++)st.append(c[m]);
        return st.toString();
    }
}
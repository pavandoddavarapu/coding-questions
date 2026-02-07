class Solution {
    public boolean isStrictlyPalindromic(int n) {
        int a=n;
        int c=2;
        StringBuilder st=new StringBuilder();
        while(c<=n-2){
            a=n;
            st=new StringBuilder();
        while(a>0){
            int b=a%c;
            st.append(""+b);
            a=a/c;
        }
        int left=0;
        int right=st.length()-1;
        while(left<right){
            if(st.charAt(left)!=st.charAt(right))return false;
            left++;
            right--;
        }
        c++;
        }
        return true;
    }
}
class Solution {
    public String reverseParentheses(String sb) {
        StringBuilder s=new StringBuilder(sb);
        int i=0;
        Stack<Integer> st=new Stack<>();
        while(i<s.length()){
            char c=s.charAt(i);
            if(c=='('){st.add(i);}
            if(c==')'){
                int a=st.pop();
                String reversedPart = new StringBuilder(s.substring(a + 1, i)).reverse().toString();
                s.replace(a , i+1, reversedPart);
                i=i-2;
            }
            i++;
        }
    return s.toString();
    }
}
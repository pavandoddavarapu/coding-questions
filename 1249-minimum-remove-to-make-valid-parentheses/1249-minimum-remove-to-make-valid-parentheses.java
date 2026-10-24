class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(char c:s.toCharArray()){
            if(c!=')'){
                if(c=='(')count++;
                st.add(c);
            }
            else{
                if(count>=1){count--;
                st.add(c);}
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            char c=st.pop();
            if(c=='(' && count>0){count--;}
            else{sb.append(c+"");}
        }
        return sb.reverse().toString();
    }
}
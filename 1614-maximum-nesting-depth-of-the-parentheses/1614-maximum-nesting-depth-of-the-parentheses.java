class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(')st.push('(');
            else if(c==')')st.pop();
            ans=Math.max(st.size(),ans);
        }
        return ans;
    }
}
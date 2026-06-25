class Solution {
    public String removeKdig(String s, int k) {
        // code here
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'0';
            while(!st.isEmpty() && c<st.peek() && k>0){
                st.pop();k--;
            }
            st.add(c);

        }
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans=ans.reverse();
        int start=0;
        while(start<ans.length() && ans.charAt(start)=='0'){
            start++;
        }
        String a=ans.substring(start,ans.length());
        if(a.equals(""))return "0";
        return a;
    }
}
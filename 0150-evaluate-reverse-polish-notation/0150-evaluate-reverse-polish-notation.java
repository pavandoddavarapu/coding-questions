class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int i=0;
        
        while(i<tokens.length){
            String t=tokens[i];
            if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
                int a=st.pop();
                int b=st.pop();
                if(t.equals("+")){st.push(b+a);}
                else if(t.equals("-")){st.push(b-a);}
                else if(t.equals("*")){st.push(b*a);}
                else if(t.equals("/")){st.push(b/a);}
            }
            else{
                st.push(Integer.parseInt(t));

            }
            i++;
        }
        return st.pop();
    }
}
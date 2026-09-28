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
                String s1=s.substring(0,a);
                String s2=s.substring(a+1,i);
                String s3=s.substring(i+1,s.length());
                System.out.print(s1+"");
                System.out.print(s2+"");
                System.out.print(s3);
                System.out.println();
                s=new StringBuilder();
                s.append(s1);
                s.append(new StringBuilder(s2).reverse().toString());
                s.append(s3);
                i=i-2;
            }
            i++;
        }
    return s.toString();
    }
}
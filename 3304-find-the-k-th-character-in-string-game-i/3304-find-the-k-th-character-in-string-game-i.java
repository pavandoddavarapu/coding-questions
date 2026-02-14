class Solution {
    public char kthCharacter(int k) {
        StringBuilder s=new StringBuilder("a");
        return helper(k,s);

    }
    public char helper(int k,StringBuilder s){
        if(k-1<s.length()){return s.charAt(k-1);}
    
            StringBuilder st=new StringBuilder();
            for(int i=0;i<s.length();i++){
                char a=s.charAt(i);
                if(a=='z'){st.append('a');}
                else{st.append((char)(a+1));}
            }
        s.append(st);
        return helper(k,s);
    }
}
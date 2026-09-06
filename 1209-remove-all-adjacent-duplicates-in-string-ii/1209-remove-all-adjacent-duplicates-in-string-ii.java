class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb=new StringBuilder();
        Stack<Integer> st=new Stack<>();
        for(char c: s.toCharArray()){
            int n=sb.length();
            
            if(n==0){sb.append(c);st.push(1);}
            else if(c==sb.charAt(n-1)){
                sb.append(c);st.push(st.peek()+1);
                if(st.peek()==k){
                    int a=0;
                    while(a<k){sb.deleteCharAt((sb.length()-1));st.pop();a++;}
                }
            }
            else{sb.append(c);st.push(1);}
        }
        return sb.toString();
    }
}
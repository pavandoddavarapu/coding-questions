class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i=0;
        int j=0;
        Stack<Integer> st=new Stack<>();
        while(i<popped.length && j<popped.length){
            if(st.isEmpty() || st.peek()!=popped[j]){
                st.push(pushed[i]);
                i++;
            }
            else{
                while(j<popped.length && !st.isEmpty() && st.peek()==popped[j]){
                    st.pop();j++;
                }
            }
        }
        while(j<popped.length && !st.isEmpty() && st.peek()==popped[j]){
                    st.pop();j++;
                }
        return st.size()==0;
    }
}
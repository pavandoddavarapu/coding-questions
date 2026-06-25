class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> idx=new Stack<>();
        int ans[]=new int[temperatures.length];
        st.add(temperatures[0]);
        idx.add(0);
        for(int i=1;i<temperatures.length;i++){
            
            if(!st.isEmpty() && st.peek()<temperatures[i]){
                while(!st.isEmpty() && st.peek()<temperatures[i]){
                    int ele=st.pop();
                    int index=idx.pop();
                    ans[index]=i-index;
                }
            }
            st.add(temperatures[i]);
            idx.add(i);
        }
        return ans;
    }
}
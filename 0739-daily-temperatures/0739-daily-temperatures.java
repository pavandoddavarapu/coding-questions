class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> idx=new Stack<>();
        int ans[]=new int[temperatures.length];
        
        idx.add(0);
        for(int i=1;i<temperatures.length;i++){
            
            if(!idx.isEmpty() && temperatures[idx.peek()]<temperatures[i]){
                while(!idx.isEmpty() && temperatures[idx.peek()]<temperatures[i]){
                    int index=idx.pop();
                    ans[index]=i-index;
                }
            }
            
            idx.add(i);
        }
        return ans;
    }
}
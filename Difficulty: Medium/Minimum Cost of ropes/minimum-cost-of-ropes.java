class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int a: arr){
            pq.add(a);
        }
        int ans=0;
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            ans=ans+a+b;
            pq.add(a+b);
        }
        return ans;
    }
}
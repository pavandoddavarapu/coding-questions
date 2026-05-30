class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int cost=0;
        
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            pq.add(a+b);
            cost=cost+a+b;
        }
        return cost;
    }
}
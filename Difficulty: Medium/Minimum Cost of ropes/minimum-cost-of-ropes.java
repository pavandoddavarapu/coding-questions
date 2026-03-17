class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int a: arr){
            pq.add(a);
        }
        int count=0;
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            pq.add(a+b);
            count=count+a+b;
        }
        return count;
    }
}
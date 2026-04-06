class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int m=0;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                arr[m]=pq.poll();m++;
            }
            }
        while(!pq.isEmpty()){arr[m]=pq.poll();m++;}
        return ;
    }
    
}

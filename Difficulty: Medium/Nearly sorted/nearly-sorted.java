class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i=0;
        while(i<k){
            pq.add(arr[i]);
            i++;
            
        }
        int kr=0;
        for(int j=i;j<arr.length;j++){
            pq.add(arr[j]);
            arr[kr]=pq.poll();
            kr++;
        }
        while(!pq.isEmpty()){
            arr[kr]=pq.poll();
            kr++;
        }
        
    }
}

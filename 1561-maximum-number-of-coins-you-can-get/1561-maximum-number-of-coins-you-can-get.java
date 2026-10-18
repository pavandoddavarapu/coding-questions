class Solution {
    public int maxCoins(int[] piles) {
        PriorityQueue<Integer> Maxpq=new PriorityQueue<>(Collections.reverseOrder());
        for(int a:piles){Maxpq.add(a);}
        int ans=0;
        for(int i=0;i<piles.length/3;i++){
            Maxpq.poll();
            ans=ans+Maxpq.poll();
        }
        return ans;
    }
}
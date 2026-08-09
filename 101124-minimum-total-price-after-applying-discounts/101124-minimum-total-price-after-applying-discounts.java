class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        PriorityQueue<Double> pq=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Double> dq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int a: prices){pq.add((double)a);}
        for(int a:discounts){dq.add((double)a);}
        double ans=0;
        while(!pq.isEmpty() && !dq.isEmpty()){
            double a=pq.poll();
            double b=dq.poll();
            double subans=(a*(100-b))/100;
            ans=ans+subans;
        }
        while(!pq.isEmpty())ans=ans+pq.poll();
        System.out.print(Math.round(ans * 10.0) / 10.0);
       
        return ans;

    }
}
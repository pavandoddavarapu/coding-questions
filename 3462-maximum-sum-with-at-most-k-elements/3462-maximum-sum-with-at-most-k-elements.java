class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        long count=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<grid.length;i++){
            PriorityQueue<Integer> pf=new PriorityQueue<>(Collections.reverseOrder());
            for(int j=0;j<grid[0].length;j++){
                
                pf.add(grid[i][j]);
                
            }
            int j=0;
            while(j<limits[i] && !pf.isEmpty()){pq.add(pf.poll());j++;}

        }
        int i=0;
        while(i<k){count+=pq.poll();i++;}
        return count;
    }
}
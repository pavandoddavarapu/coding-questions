class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer,PriorityQueue<Integer>> hm=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int a=mat[i][j];
                int b=i-j;
                if(!hm.containsKey(b)){
                    hm.put(b,new PriorityQueue<>());
                    
                }
                hm.get(b).add(a);
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int b=i-j;
                mat[i][j]=hm.get(b).poll();
            }
        }
        return mat;
    }
}
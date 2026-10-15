class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int a=mat[i][j];
                int b=i-j;
                if(!hm.containsKey(b)){
                    hm.put(b,new ArrayList<>());
                    
                }
                hm.get(b).add(a);
            }
        }
        for(Map.Entry<Integer,ArrayList<Integer>> entry: hm.entrySet()){
            Collections.sort(entry.getValue());
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int b=i-j;
                mat[i][j]=hm.get(b).remove(0);
                
            }
        }
        return mat;
    }
}
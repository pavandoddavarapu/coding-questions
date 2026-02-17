class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> hm=new HashMap<>();
        int count=0;
        for(int i=0;i<grid.length;i++){
            StringBuilder row=new StringBuilder();
            for(int j=0;j<grid[0].length;j++){
                row.append(grid[i][j]+",");
            }
            hm.put(row.toString(),hm.getOrDefault(row.toString(),0)+1);
        }
        for(int i=0;i<grid.length;i++){
            StringBuilder col=new StringBuilder();
            for(int j=0;j<grid[0].length;j++){
                col.append(grid[j][i]+",");
            }
            if(hm.containsKey(col.toString())){
                count=count+hm.get(col.toString());
            }
        }
        return count;
    }
}
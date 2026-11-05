class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer,int[]> hm=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                hm.put(mat[i][j],new int[]{i,j});
            }
        }
        int row[]=new int[mat.length];
        int col[]=new int[mat[0].length];
        int is=mat.length;
        int js=mat[0].length;
        for(int i=0;i<arr.length;i++){
            int a[]=hm.get(arr[i]);
            row[a[0]]++;
            col[a[1]]++;
            if(row[a[0]]==js || col[a[1]]==is)return i;
            
        }
        return 0;
    }
}
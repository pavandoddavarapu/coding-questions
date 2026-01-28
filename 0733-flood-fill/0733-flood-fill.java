class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int actualcolor=image[sr][sc];
        if(actualcolor==color){return image;}
        dfs(image,sr,sc,color,actualcolor);
        image[sr][sc]=color;
        return image;
    }
    public void dfs(int[][] image,int sr,int sc,int color,int actualcolor){
        if(image[sr][sc]!=actualcolor){return;}
        image[sr][sc]=color;
        int col=image[0].length;
        int row=image.length;
        if(sr+1<row && image[sr+1][sc]==actualcolor){dfs(image,sr+1,sc,color,actualcolor);}
        if(sc+1<col && image[sr][sc+1]==actualcolor){dfs(image,sr,sc+1,color,actualcolor);}
        if(sr-1>=0 && image[sr-1][sc]==actualcolor){dfs(image,sr-1,sc,color,actualcolor);}
        if(sc-1>=0 && image[sr][sc-1]==actualcolor){dfs(image,sr,sc-1,color,actualcolor);}
        return ;
    }
}
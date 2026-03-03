class Solution {
    public class pair{
        int a;
        int b;
        pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)return image;
        int ac=image[sr][sc];
        boolean visited[][] =new boolean[image.length][image[0].length];
        Queue<pair> c=new LinkedList<>();
        c.add(new pair(sr,sc));
       image[sr][sc]=color;
        while(!c.isEmpty()){
            pair p=c.poll();
            int i=p.a;
            int j=p.b;
            
            if(i-1>=0 && !visited[i-1][j] && image[i-1][j]==ac){c.add(new pair(i-1,j));visited[i-1][j]=true;image[i-1][j]=color;}
            if(j+1<=image[0].length-1 && !visited[i][j+1] && image[i][j+1]==ac){c.add(new pair(i,j+1));visited[i][j+1]=true;image[i][j+1]=color;}
            if(i+1<=image.length-1 && !visited[i+1][j] && image[i+1][j]==ac){c.add(new pair(i+1,j));visited[i+1][j]=true;image[i+1][j]=color;}
            if(j-1>=0 && !visited[i][j-1] && image[i][j-1]==ac){c.add(new pair(i,j-1));visited[i][j-1]=true;image[i][j-1]=color;}
        }
        return image;
    }
}
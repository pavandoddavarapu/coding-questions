class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ac=image[sr][sc];
        boolean visited[][] =new boolean[image.length][image[0].length];
        Queue<Integer> c=new LinkedList<>();
        Queue<Integer> r=new LinkedList<>();
        c.add(sr);
        r.add(sc);
        while(!c.isEmpty()){
            int i=c.poll();
            int j=r.poll();
            image[i][j]=color;
            if(i-1>=0 && !visited[i-1][j] && image[i-1][j]==ac){c.add(i-1);r.add(j);visited[i-1][j]=true;}
            if(j+1<=image[0].length-1 && !visited[i][j+1] && image[i][j+1]==ac){c.add(i);r.add(j+1);visited[i][j+1]=true;}
            if(i+1<=image.length-1 && !visited[i+1][j] && image[i+1][j]==ac){c.add(i+1);r.add(j);visited[i+1][j]=true;}
            if(j-1>=0 && !visited[i][j-1] && image[i][j-1]==ac){c.add(i);r.add(j-1);visited[i][j-1]=true;}
        }
        return image;
    }
}
class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> ls=new ArrayList<>();
        boolean chess[][]=new boolean[8][8];
        for(int[] a:queens){
            chess[a[0]][a[1]]=true;
        }
        int a=king[0];
        int b=king[1];
        for(int i=a-1;i>=0;i--){
            if(chess[i][b]==true){
                List<Integer> arr=new ArrayList();
                arr.add(i);
                arr.add(b);
                ls.add(arr);break;
            }
        }
        for(int i=a+1;i<8;i++){
            if(chess[i][b]==true){
                List<Integer> arr=new ArrayList();
                arr.add(i);
                arr.add(b);
                ls.add(arr);break;
            }
        }
        for(int i=b-1;i>=0;i--){
            if(chess[a][i]==true){
                List<Integer> arr=new ArrayList();
                arr.add(a);
                arr.add(i);
                ls.add(arr);break;
            }
        }
        for(int i=b;i<8;i++){
            if(chess[a][i]==true){
                List<Integer> arr=new ArrayList();
                arr.add(a);
                arr.add(i);
                ls.add(arr);break;
            }
        }
        int i=a;
        int j=b;
        while(i>=0 && j>=0){
            if(chess[i][j]==true){
                List<Integer> arr=new ArrayList();
                arr.add(i);
                arr.add(j);
                ls.add(arr);break;
            }
            i--;j--;
        }
        i=a;
        j=b;
        while(i<8 && j<8){
            if(chess[i][j]==true){
                List<Integer> arr=new ArrayList();
                arr.add(i);
                arr.add(j);
                ls.add(arr);break;
            }
            i++;j++;
        }
        i=a;
        j=b;
        while(i>=0 && j>=0 && i<8 && j<8){
            if(chess[i][j]==true){
                List<Integer> arr=new ArrayList();
                arr.add(i);
                arr.add(j);
                ls.add(arr);break;
            }
            i--;j++;
        }
        i=a;
        j=b;
        while(i>=0 && j>=0 && i<8 && j<8){
            if(chess[i][j]==true){
                List<Integer> arr=new ArrayList();
                arr.add(i);
                arr.add(j);
                ls.add(arr);break;
            }
            i++;j--;
        }
        return ls;
    }
}
class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] nn=new char[n][n];
        for (int i = 0; i < n; i++) {
    Arrays.fill(nn[i], '.');
}

        List<List<String>> arr=new ArrayList<>();
        helper(nn,0,arr);
        return arr;
    }
    public void helper(char[][] nn,int row,List<List<String>> arr){
        int n=nn.length;
       if(row==n){
            List<String> ar=new ArrayList<>();
            for(int i=0;i<row;i++){
                StringBuilder s=new StringBuilder("");
                for(int j=0;j<row;j++){
                    s.append(nn[i][j]);
                }
                ar.add(s.toString());
            }
            arr.add(ar);
            return;
       }
       
       for(int i=0;i<n;i++){
        if(isSafe(nn,row,i)){
            nn[row][i]='Q';
            helper(nn,row+1,arr);
            nn[row][i]='.';
        }
       }

    }
    public boolean isSafe(char[][] nn,int row,int col){
        int n=nn.length;
        for(int i=0;i<n;i++){
            if(i==col){continue;}
            if(nn[row][i]=='Q' ){return false;}
            
        }
        for(int i=0;i<row;i++){
            if(i==row){continue;}
            if(nn[i][col]=='Q'){return false;}
            
        }

        
        int i=row;
        int j=col;

        while(i<n && j<n){
            if(i==row && j==col){i++;j++;continue;}
            if(nn[i][j]=='Q'){return false;}
            i++;j++;
        }
        i=row;
        j=col;
         while(i>=0 && j>=0){
            if(i==row && j==col){i--;j--;continue;}
            if(nn[i][j]=='Q' && (i!=row && j!=col)){return false;}
            i--;j--;
        }
        i=row;
        j=col;
         while(i<n && j>=0){
            if(i==row && j==col){i++;j--;continue;}
            if(nn[i][j]=='Q'){return false;}
            i++;j--;
        }
        i=row;
        j=col;
        while(i>=0 && j<n){
            if(i==row && j==col){i--;j++;continue;}
            if(nn[i][j]=='Q'){return false;}
            i--;j++;
        }
        return true;
    }
}
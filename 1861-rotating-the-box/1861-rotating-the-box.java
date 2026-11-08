class Solution {
    public char[][] rotateTheBox(char[][] bg) {
        
        for(int i=0;i<bg.length;i++){
            int right=bg[0].length-1;
            
            char arr[]=bg[i];
            while(right>=0){
                int count=0;
                int k=right;
                while(right>=0 && arr[right]!='*'){if(arr[right]=='#')count++;right--;}
                while(k>right && count>0){arr[k]='#';count--;k--;}
                while(k>right){arr[k]='.';k--;}
                while(right>=0 && arr[right]=='*'){right--;}

            }
            bg[i]=arr;
        }
        int m=bg.length;
        int n=bg[0].length;
        char[][] ans=new char[bg[0].length][bg.length];
        for(int i=0;i<bg.length;i++){
            for(int j=0;j<bg[0].length;j++){
                ans[j][m - 1 - i] = bg[i][j];
            }
        }
    return ans;
    }
}
class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            char a[]=(i+"").toCharArray();
            for(int j=1;j<a.length-1;j++){
                char d=a[j-1];
                char b=a[j];
                char c=a[j+1];
                if((d<b && b>c) || (d>b && b<c))count++;
            }
            
        }
        return count;
    }
}
// User function Template for Java

class Solution {
    public int minNumber(int arr[], int N) {
        
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        if(sum==1){return 1;}
        int a=sum;
        int b=0;
        int c=0;
        while(true){
            boolean flag=true;
            for(int i=2;i*i<=a;i++){
                if(a%i==0){flag=false;break;}
            }
            if(flag){
            return a-sum;}
            a++;
        }
        
        
    }
}

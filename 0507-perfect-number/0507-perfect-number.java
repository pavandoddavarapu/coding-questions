class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1)return false;
        int sum=1;
        int i=2;
        while(i*i<=num){
            if(num%i==0){
                int a=num/i;
                if(i==a){
                sum=sum+i;}
                else{
                    sum=sum+i+a;
                }
                
            }
            i++;
        }
        System.out.println(sum);
        return sum==num;
    }
}
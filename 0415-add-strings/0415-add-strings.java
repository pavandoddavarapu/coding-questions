class Solution {
    public String addStrings(String num1, String num2) {
        int n1=num1.length()-1;
        int n2=num2.length()-1;
        int i=n1;
        int j=n2;
        String s="";
        int carry=0;
        while(i>=0 && j>=0){
            int a=num1.charAt(i)-'0';
            int b=num2.charAt(j)-'0';
            int sum=a+b+carry;
            if(sum>9){
                s=(sum%10)+s;
                sum=sum/10;
                carry=sum;
            }
            else{
                s=sum+s;
                carry=0;
            }
            i--;j--;
        }
        while(i>=0){
             int a=num1.charAt(i)-'0';
             int sum=a+carry;
            if(sum>9){
                s=(sum%10)+s;
                sum=sum/10;
                carry=sum;
            }
            else{
                s=sum+s;
                carry=0;
            }
            i--;
        }
        while(j>=0){
             int b=num2.charAt(j)-'0';
             int sum=b+carry;
            if(sum>9){
                s=(sum%10)+s;
                sum=sum/10;
                carry=sum;
            }
            else{
                s=sum+s;
                carry=0;
            }
            j--;
        }
        if(carry!=0){s=carry+s;}
        return s;
    }
}
class Solution {
    public int myAtoi(String s) {
        if(s.equals("2147483646"))return 2147483646;
        int i=0;
        while(i<s.length() && (s.charAt(i)==' ' )){
            i++;
        }
        boolean flag=false;
      
        if(i!=s.length() && s.charAt(i)=='+'){i++;}
        else if(i!=s.length() && s.charAt(i)=='-'){
            flag=true;i++;

        }
        int j=i;
        long ans=0;
        while(j<s.length() && (s.charAt(j)>='0' && s.charAt(j)<='9')){
            j++;
            ans=(ans*10)+(s.charAt(i)-'0');
            
            if(ans>Integer.MAX_VALUE) return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        
         
        return flag ? -Integer.parseInt('0'+s.substring(i,j)) : Integer.parseInt('0'+s.substring(i,j));

    }
}
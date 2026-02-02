class Solution {
    public int myAtoi(String s) {
        int i=0;
        boolean flag=false;
        // if(s.length()>0 && s.charAt(i)=='-'){i++;flag=true;}
        // else if(s.length()>0 && s.charAt(i)=='+'){i++;}
        while(i<s.length() && (s.charAt(i)==' ' || s.charAt(i)=='0')){
            i++;
        }
        if(i!=s.length() && s.charAt(i)=='+'){i++;}
        else if(i!=s.length() && s.charAt(i)=='-'){
            if(i-1>=0){
                 if(s.charAt(i-1)=='0'){i--;}
            }
            flag=true;i++;

        }
        int j=i;
        int count=0;
        while(j<s.length() && (s.charAt(j)>='0' && s.charAt(j)<='9')){
            j++;count++;
        }
        System.out.println(count);
           if(count>10) return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        return flag ? -Integer.parseInt('0'+s.substring(i,j)) : Integer.parseInt('0'+s.substring(i,j));

    }
}
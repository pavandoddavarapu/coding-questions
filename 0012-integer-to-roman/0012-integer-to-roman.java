class Solution {
    public int getFirstDigit(int number) {
    // Handle negative numbers and zero safely
    if (number == 0) return 0;
    int absNumber = Math.abs(number); 
    
    // Find total digits minus 1 using log10
    int power = (int) Math.log10(absNumber); 
    
    // Divide by 10^power to isolate the first digit
    return absNumber / (int) Math.pow(10, power);
}
    public String intToRoman(int num) {
        StringBuilder st=new StringBuilder();
        while(num>0){
            int a=getFirstDigit(num);
            if(num>=1000){
                int i=0;
                while(i<a){st.append("M");i++;}
                num=num-(1000*a);
            }
            else if(num>=100){
                if(a==4){
                    st.append("CD");
                }
                else if(a==9){
                    st.append("CM");
                }
                else if(a>=5){st.append("D");num=num-500;continue;}
                else{
                    int i=0;
                    while(i<a){
                        st.append("C");i++;
                    }
                }
                num=num-(100*a);
            }
            else if(num>=10){
                if(a==4){
                    st.append("XL");
                }
                else if(a==9){
                    st.append("XC");
                }
                else if(a>=5){st.append("L");num=num-50;continue;}
                else{
                    int i=0;
                    while(i<a){
                        st.append("X");i++;
                    }
                }
                num=num-(10*a);
            }
            else if(a>0){
                if(a==4){st.append("IV");}
                else if(a==9){st.append("IX");}
                else if(a>=5){st.append("V");num=num-5;continue;}
                else{
                    int i=0;
                    while(i<a){
                        st.append("I");i++;
                    }
                }
                num=num-(1*a);
            }
        }
        return st.toString();
    }
}
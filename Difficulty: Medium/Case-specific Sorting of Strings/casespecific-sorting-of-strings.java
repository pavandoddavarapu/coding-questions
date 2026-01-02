class Solution {
    public static String caseSort(String st) {
        // code here
        char small[]=new char[st.length()];
        Arrays.fill(small,'z');
        char big[]=new char[st.length()];
        Arrays.fill(big,'Z');
        int s=0;
        int b=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)<='Z'){big[b]=st.charAt(i);b++;}
            else{small[s]=st.charAt(i);s++;}
            
        }
        Arrays.sort(small);
        Arrays.sort(big);
        s=0;b=0;
        char bi[]=new char[st.length()];
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)<='Z'){bi[i]=big[b];b++;}
            else{bi[i]=small[s];s++;}
            
        }
        return new String(bi);
    }
}
class Solution {
    public String reversePrefix(String word, char ch) {
        char[] c=word.toCharArray();
        int i=0;
        int j=word.length()-1;
        for(int p=0;p<word.length();p++){
            if(word.charAt(p)==ch){j=p;break;}
            else if(p==j)return word;
        }
        
        while(i<j){
            char chs=c[i];
            c[i]=c[j];
            c[j]=chs;
            i++;
            j--;
        }
        StringBuilder st=new StringBuilder();
        for(int m=0;m<c.length;m++)st.append(c[m]);
        return st.toString();
    }
}
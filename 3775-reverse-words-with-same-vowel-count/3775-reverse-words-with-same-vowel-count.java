class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        int ct=0;
        
        for(int i=0;i<words[0].length();i++){
            char c=words[0].charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')ct++;
        }
        for(int j=1;j<words.length;j++){
            String st=words[j];
            int count=0;
        for(int i=0;i<st.length();i++){
            char c=st.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')count++;
        }
        if(ct==count){
            StringBuilder sb=new StringBuilder(st);
            words[j]=sb.reverse().toString();
        }
        }
        return String.join(" ",words);
    }
}
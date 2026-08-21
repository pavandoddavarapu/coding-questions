class Solution {
    public String sortSentence(String s) {
        String ans[]=s.split(" ");
        Arrays.sort(ans,(a,b)->(int)a.charAt(a.length()-1)-(int)b.charAt(b.length()-1));
        StringBuilder st=new StringBuilder();
        for(String a:ans){StringBuilder sb=new StringBuilder(a);st.append(sb.substring(0,sb.length()-1)+" ");}
        return st.substring(0,st.length()-1);
    }
}
class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        StringBuilder st=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(!arr[i].toString().isEmpty())st.append(" "+(arr[i]).trim());
        }
        return st.toString().trim();
    }
}
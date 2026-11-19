class Solution {
    public boolean isValid(String s) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.indexOf("abc")!=-1){
            int a=sb.indexOf("abc");
            sb.replace(a,a+3,"");
        }
        if(sb.toString()=="")return true;
        return false;
    }
}
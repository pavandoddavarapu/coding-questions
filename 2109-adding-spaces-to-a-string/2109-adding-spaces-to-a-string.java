class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int j=0;
        if(spaces[j]==0){sb.append(" ");j++;}
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i)+"");
            if(j<spaces.length && spaces[j]==i+1){sb.append(" ");j++;}
        }
        return sb.toString();
    }
}
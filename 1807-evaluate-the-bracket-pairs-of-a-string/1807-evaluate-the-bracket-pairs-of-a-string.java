class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        HashMap<String,String> hm=new HashMap<>();
        for(List<String> ls:knowledge){
            hm.put(ls.get(0),ls.get(1));
        }
        while(i<sb.length()){
            if(sb.charAt(i)=='('){
                int j=i;
                while(sb.charAt(j)!=')'){
                    j++;
                }
                String k=hm.get(sb.substring(i+1,j));
                sb.replace(i,j+1,k!=null?k:"?");
                
            }
            else{i++;}
        }
        return sb.toString();
    }
}
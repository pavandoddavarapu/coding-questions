class Solution {
    public List<String> validStrings(int n) {
        List<String> ls=new ArrayList<>();
        helper(n,"",ls);
        return ls;
    }
    public void helper(int n,String s,List<String> ls){
        if(s.length()==n){
            ls.add(s);
            return;
        }
        if(s.length()!=0 && s.charAt(s.length()-1)=='0'){
            helper(n,s+"1",ls);
        }
        else{
            helper(n,s+"0",ls);
            helper(n,s+"1",ls);
        }
    }
}
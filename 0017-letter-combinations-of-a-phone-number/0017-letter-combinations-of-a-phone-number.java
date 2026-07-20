class Solution {
    public List<String> letterCombinations(String digits) {
        String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ls=new ArrayList<>();
        helper(arr,ls,digits,0,"");
        return ls;
    }
    public void helper(String arr[],List<String> ls,String digits,int i,String ans){
        if(i==digits.length()){
            ls.add(ans);return;
        }
        int c=digits.charAt(i)-'0';
        String st=arr[c];
        for(int j=0;j<st.length();j++){
            helper(arr,ls,digits,i+1,ans+st.charAt(j));
        }
    }
}
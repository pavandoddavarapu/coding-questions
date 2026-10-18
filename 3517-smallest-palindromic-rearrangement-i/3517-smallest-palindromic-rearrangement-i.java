class Solution {
    public String smallestPalindrome(String s) {
        int arr[]=new int[26];
        for(char a:s.toCharArray())arr[a-'a']++;
        StringBuilder sb=new StringBuilder();
        int j=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            char c=(char)('a'+i);
            
            if(a%2!=0){
                sb.insert(j,c+"");a--;
            }
            while(a>0){
                sb.insert(j,""+c);a=a-2;
                sb.insert(sb.length()-j,""+c);j++;
                
            }
        }
        return sb.toString();
    }
}
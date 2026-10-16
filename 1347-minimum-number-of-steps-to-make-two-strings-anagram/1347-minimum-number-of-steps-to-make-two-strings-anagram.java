class Solution {
    public int minSteps(String s, String t) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        int count=0;
        for(int a:arr){
            if(a<0)count=count+a;
        }
        return Math.abs(count);
    }
}
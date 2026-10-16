class Solution {
    public int minSteps(String s, String t) {
        int[] arr=new int[26];
        for(char a:s.toCharArray()){
             arr[a-'a']++;
        }
        for(int a: t.toCharArray()){
           
            arr[a-'a']--;
        }
        int count=0;
        for(int a:arr){
            if(a<0)count=count+a;
        }
        return Math.abs(count);
    }
}
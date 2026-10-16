class Solution {
    public int minimumLength(String s) {
        int arr[]=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        int count=0;
        for(int a:arr){
            if(a<=2)count=count+a;
            else if(a%2==0){
                count=count+2;
            }
            else{count++;}
        }
        return count;
    }
}
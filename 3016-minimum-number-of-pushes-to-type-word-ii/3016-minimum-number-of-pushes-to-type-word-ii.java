class Solution {
    public class pair{
        
    }
    public int minimumPushes(String word) {
        char[] ch=word.toCharArray();
        int ans[]=new int[26];
        for(char c:ch){
            ans[c-'a']++;
        }
        
        Arrays.sort(ans);
        int k=0;
        int count=0;
        for(int i=25;i>=0;i--){
            int m=ans[i];
            if(ans[i]==0)continue;
            if(k<8){
                count=count+m;
                k++;
            }
            else if(k>=8 && k<16){
                count=count+(2*m);
                k++;
            }
            else if(k>=16 && k<24){
                count=count+(3*m);
                k++;
            }
            else{
                count=count+(m*4);
                k++;
            }
            System.out.print(count+",");
        }
        return count;
    }
}
// User function Template for Java

class Solution {

    static int nextHappy(int N) {
        int ans=0;
        // code here
        
        
        int c=N;
        while(N!=1){
            int a=helper(N+1);
            if(a==0){N++;}
            else{return a;}
        }
        return ans;
    }
    public static int helper(int N){
        int c=N;
        HashSet<Integer> hs=new HashSet<>();
        while(N!=1){
            int a=0;
            int d=N;
             while(N>0){
                int b=N%10;
                N=N/10;
                a=a+(b*b);
            }
            
            if(a==1){return c;}
            if(!hs.add(a)){
                return 0;
            }
            N=a;
        }
        return 1;
    }
}
// User function Template for Java
class Solution {
    public int[] leastPrimeFactor(int n) {
        // code here
        boolean []sieve=new boolean[n+1];
        int ans[]=new int[n+1];
        for(int i=2;i<ans.length;i++){
            if(sieve[i]==false){
                ans[i]=i;
                 int a=i;
                while(a<=n){
                    if(a%i==0){
                        if(sieve[a]==false){ans[a]=i;}
                        sieve[a]=true;
                    }
                        a++;
                }
            }
            
        }
        ans[1]=1;
        return ans;
    }
}
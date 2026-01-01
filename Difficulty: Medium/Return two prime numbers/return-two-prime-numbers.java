// User function Template for Java

class Solution {
    static List<Integer> primeDivision(int n) {
        // code here
        
        boolean sieve[]=new boolean[n+1];
        for(int i=2;i<=n;i++){
            if(sieve[i]==false){
                int a=i;
                while(a<=n){
                    if(a%i==0 && a!=i){sieve[a]=true;}
                    a=a+i;
                }
                
            }
        }
        int left=2;
        int right=sieve.length-1;
        for(int i=2;i<sieve.length;i++){
            while(left<=right){
                if(sieve[left]==true){
                    left++;
                }
                else if(sieve[right]==true){
                    right--;
                }
                else{
                    if(left+right>n){
                        right--;
                    }
                    else if(left+right<n){
                        left++;
                    }
                    else{
                        ArrayList<Integer> a=new ArrayList<>();
                        a.add(left);
                        a.add(right);
                        return a;
                    }
                }
                
            }
        }
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        return a;
    }
}
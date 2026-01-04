class Solution {
    public int sumFourDivisors(int[] nums) {
        int memo[]=new int[10000+1];
        boolean memb[]=new boolean[10000+1];
        int k=0;
        for(int i=0;i<nums.length;i++){
            Set<Integer> hs=new HashSet<Integer>();
            int n=nums[i];
            int j=2;
            if(memo[i]==0||memb[i]==false){
            for(int l=1;l*l<=n;l++){
                if(n%l==0){hs.add(l);hs.add(n/l);}
            }
            
            int count=0;
            if(hs.size()==4){
                for(int a: hs){
                    k=k+a;
                    count=count+a;
                }
            memo[i]=count;
            }
            }
            else{k=k+memo[i];}
            memb[i]=true;
        }
        return k;
    }
}

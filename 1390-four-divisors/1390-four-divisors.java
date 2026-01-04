class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int sum=0;
            int count=0;
            for(int j=2;j<a;j++){
                if(a%j==0){
                    sum=sum+j;
                    int b=a/j;
                    // sum=sum+b;
                    count++;
                    
                }
                
                if(count>2){sum=0;break;}
            }
            if(count!=0 && count!=1 && sum!=0){ans=ans+sum+1+a;}
        }
        return ans;
    }
}
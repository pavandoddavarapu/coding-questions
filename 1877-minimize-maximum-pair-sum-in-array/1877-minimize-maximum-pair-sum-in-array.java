class Solution {
    public int minPairSum(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            n=Math.max(n,nums[i]);
        }
        int count[]=new int[n+1];
        for(int a:nums){count[a]++;}
        int i=0;int j=count.length-1;
        int c=0;
        while(i<j){
            while(i<j && count[i]==0)i++;
            while(j>i && count[j]==0)j--;
            if(!(i>=0 && i<count.length && j>=0 && j<count.length ))break;
            while( count[i]!=0 && count[j]!=0){
            int a=i+j;count[i]--;count[j]--;c=Math.max(c,a);}
            if(count[i]==0)i++;
            if(count[j]==0)j--;
        }
        return c;
    }
}
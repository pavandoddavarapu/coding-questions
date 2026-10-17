class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0;
        int a=0;
        for(int b:nums)a=a^b;
        for(int i=0;i<32;i++){
            if((a%2!=0 && k%2==0) || (a%2==0 && k%2!=0))count++;
            a=a>>1;
            k=k>>1;
        }
        return count;
    }
}
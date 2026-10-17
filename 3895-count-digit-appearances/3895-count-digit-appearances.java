class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int a:nums){
            while(a>0){
                int b=a%10;
                if(b==digit)count++;
                a=a/10;
            }
        }
        return count;
    }
}
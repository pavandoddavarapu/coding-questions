class Solution {
    public int[] leftRightDifference(int[] nums) {
        int prefix[]=new int[nums.length];
        int suffix[]=new int[nums.length];
        System.out.print("0"+" ");
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i-1]+prefix[i-1];
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=nums[i+1]+suffix[i+1];
            System.out.print(suffix[i]+" ");
        }
        int ans[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){ans[i]=Math.abs(prefix[i]-suffix[i]);}
        return ans;
    }
}
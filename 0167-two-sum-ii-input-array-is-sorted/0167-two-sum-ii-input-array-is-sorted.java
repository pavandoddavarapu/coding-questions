class Solution {
    public int[] twoSum(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        int[] a={0,0};
        while(left<right){
            if(arr[left]+arr[right]==target)
            {
            a[0]=left+1;
            a[1]=right+1;
            return a;
            }
            else if(arr[left]+arr[right]>target){
                right--;
            }
            else {
                left++;
            }
        }
        return a;
    }
}
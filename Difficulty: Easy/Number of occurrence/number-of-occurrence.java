class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int left=0;
        int right=arr.length-1;
        
        int ans1=0;
        int ans2=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target<=arr[mid]){
                ans1=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        right=arr.length-1;
        left=0;
        
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target<arr[mid]){
                
                right=mid-1;
            }
            else{
                ans2=mid;
                left=mid+1;
            }
        }
        
        return ans2<arr.length && ans1<arr.length && arr[ans1]==target && arr[ans2]==target ?ans2-ans1+1:0;
    }
}

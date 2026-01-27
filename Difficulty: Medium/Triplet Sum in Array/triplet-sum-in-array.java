class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int l=i+1;
            int r=arr.length-1;
            while(l<r){
                int sum=arr[l]+arr[r]+arr[i];
                if(sum==target){return true;}
                else if(sum>target){r--;}
                else{l++;}
            }
        }
        return false;
    }
}

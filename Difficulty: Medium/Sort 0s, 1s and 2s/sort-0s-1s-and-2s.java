class Solution {
    public void sort012(int[] arr) {
        // code here
        int l=0;
        int r=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                l++;
            }
            else if(arr[i]==1){
                r++;
            }
            else{
                k++;
            }
        }
        int i=0;
        while(i<l){arr[i]=0;i++;}
        while(i<l+r){arr[i]=1;i++;}
        while(i<l+r+k){arr[i]=2;i++;}
        return ;
    }
}
class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public static void mergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int arr[],int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] lf=new int[n1];
        int[] rf=new int[n2];
        for(int i=0;i<n1;++i){
            lf[i]=arr[left+i];

        }
        for(int i=0;i<n2;++i){
            rf[i]=arr[mid+1+i];
        }
        int i=0,j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(lf[i]<=rf[j]){
                arr[k]=lf[i];
                k++;
                i++;
            }
            else{
                arr[k]=rf[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k]=lf[i];
                k++;
                i++;
        }
        while(j<n2){
            arr[k]=rf[j];
                j++;
                k++;
        }
    }

}
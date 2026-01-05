class Solution {

    void mergeSort(int arr[], int start, int end) {
        // code here
        if(start==end){return;}
        int mid=start+((end-start)/2);
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    
    void merge(int arr[],int l,int mid,int r){
        int a=l;
        int b=mid+1;
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(a<=mid && b<=r){
            if(arr[a]<=arr[b]){
                al.add(arr[a]);a++;
            }
            else{
                al.add(arr[b]);b++;
            }
        }
        while(a<=mid){
            al.add(arr[a]);a++;
        }
        while(b<=r){
            al.add(arr[b]);b++;
        }
        for(int i=0;i<al.size();i++){
            arr[l+i]=al.get(i);
        }
    }
}
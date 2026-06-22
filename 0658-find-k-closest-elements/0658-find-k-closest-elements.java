class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left=0;
        int right=arr.length-1;
        while(right-left>=k){
            int a=Math.abs(arr[left]-x);
            int b=Math.abs(arr[right]-x);
            if(a<=b)right--;
            else left++;
        }
        List<Integer> ls=new ArrayList<>();
        for(int i=left;i<=right;i++){
            ls.add(arr[i]);
        }
        
        return ls;
    }
}
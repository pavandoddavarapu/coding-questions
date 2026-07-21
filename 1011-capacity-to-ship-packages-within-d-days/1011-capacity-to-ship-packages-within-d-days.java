class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int start=0;
        for(int i=0;i<weights.length;i++){
            sum=sum+weights[i];
            start=Math.max(start,weights[i]);
        }
        int end=sum;
        int a=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(helper(weights,days,mid)){a=mid;end=mid-1;}
            else{start=mid+1;}
        }
        return a;
    }
    public boolean helper(int[] weights, int days,int mid){
        int count=0;
        int i=0;
        int a=0;
        while(i<weights.length){
            if(a+weights[i]<=mid){
                a=a+weights[i];
                i++;
            }
            else{
                count++;
                a=0;
                a=a+weights[i];i++;
            }
        }
        if(a!=0)count++;
        return count<=days;
    }
}
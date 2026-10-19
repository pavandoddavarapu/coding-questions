class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        Arrays.sort(quantities);
        int lo=1;
        int hi=quantities[quantities.length-1];
        int ans=0;
        while(lo<=hi){
            int mid=lo+((hi-lo)/2);
            if(helper(mid,n,quantities)){
             ans=mid;
             hi=mid-1;
               
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public boolean helper(int mid,int n, int[] quantities){
        for(int i=0;i<quantities.length;i++){
            int a=quantities[i];
            while(a>0){a=a-mid;n--;if(n<0)return false;}
            if(n<0)return false;
        }
        return true;
    }
}
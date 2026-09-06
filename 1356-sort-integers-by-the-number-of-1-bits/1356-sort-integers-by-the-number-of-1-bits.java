class Solution {
    public class pair{
        int n;
        int c;
        pair(int n,int c){
            this.n=n;
            this.c=c;
        }
    }
    public int[] sortByBits(int[] arr) {
        pair[] p=new pair[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=0;
            int a=arr[i];
            while(a>0){
                a=a&(a-1);
                count++;
            }
            p[i]=new pair(arr[i],count);
        }
        Arrays.sort(p,(a,b)->{if(a.c!=b.c)return a.c-b.c; else return a.n-b.n;});
        for(int i=0;i<arr.length;i++){
            arr[i]=p[i].n;
        }
        return arr;
    }
}
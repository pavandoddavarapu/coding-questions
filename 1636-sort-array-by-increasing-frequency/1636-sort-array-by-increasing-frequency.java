class Solution {
    public class s{
        int n;
        int count;
        public s(int n,int c){
            this.n=n;
            this.count=c;
        }
    }
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a: nums){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
       
        s freq[]=new s[hm.size()];
        int c=0;
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            freq[c]=new s(entry.getKey(),entry.getValue());c++;
        }
        Arrays.sort(freq,(a,b)->{
            if(a.count!=b.count){return Integer.compare(a.count,b.count);}
            else{return Integer.compare(b.n,a.n);}
        });
        c=0;
        for(s a:freq){
            int count=a.count;
            int n=a.n;
            int m=0;
            while(m<count){
                nums[c]=n;
                m++;
                c++;
            }
        }
        return nums;
    }
}
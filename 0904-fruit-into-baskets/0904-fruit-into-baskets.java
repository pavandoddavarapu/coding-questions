
class Solution {
    public int totalFruit(int[] fruits) {
        // code here
        int k=2;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int left=0;
        int right=0;
        int ans=0;
        while(right<fruits.length){
            int cr=fruits[right];
            hm.put(cr,hm.getOrDefault(cr,0)+1);
            while(hm.size()>k){
                int cl=fruits[left];
                if(hm.get(cl)==1)hm.remove(cl);
                else{hm.put(cl,hm.get(cl)-1);}
                left++;
            }
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
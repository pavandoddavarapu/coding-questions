class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> hm=new HashMap<>();
        int left=0;
        int right=0;
        int ans=-1;
        while(right<s.length()){
            char cr=s.charAt(right);
            hm.put(cr,hm.getOrDefault(cr,0)+1);
            while(hm.size()>k){
                char cl=s.charAt(left);
                if(hm.get(cl)==1)hm.remove(cl);
                else{hm.put(cl,hm.get(cl)-1);}
                left++;
            }
            if(hm.size()==k)ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
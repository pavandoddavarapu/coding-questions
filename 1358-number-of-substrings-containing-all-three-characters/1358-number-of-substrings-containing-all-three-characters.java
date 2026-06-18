class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int right=0;
        for(int i=0;i<3;i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        right=3;
        int left=0;
        int count=0;
        while(right<s.length() || hm.size()==3){
            if(right<s.length() && hm.size()<3){
                hm.put(s.charAt(right),hm.getOrDefault(s.charAt(right),0)+1);
                right++;
            }
            else if(hm.size()==3){
                count=count+s.length()-right+1;
                if(hm.get(s.charAt(left))==1){hm.remove(s.charAt(left));}

                else{
                    hm.put(s.charAt(left),hm.getOrDefault(s.charAt(left),0)-1);
                }
                left++;
                            }

        }
        return count;
    }
}
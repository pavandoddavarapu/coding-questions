class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int a: nums)hs.add(a);
        int maxCount=0;
        for(int a:hs){
            if(!hs.contains(a-1)){
                int b=a;
                int currsum=0;
                while(hs.contains(b)){
                    currsum++;
                    b++;
                }
                maxCount=Math.max(currsum,maxCount);
            }
        }
        return maxCount;
    }
}
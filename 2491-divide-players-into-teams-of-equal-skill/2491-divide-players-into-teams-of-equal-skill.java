class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int left=0;
        int right=skill.length-1;
        long ans=0L;
        long prev=skill[left]+skill[right];
        while(left<right){
            ans=ans+(skill[left]*skill[right]);
            if(prev!=skill[left]+skill[right])return -1;
            else prev=skill[left]+skill[right];
            left++;
            right--;
        }
        return ans;
    }
}
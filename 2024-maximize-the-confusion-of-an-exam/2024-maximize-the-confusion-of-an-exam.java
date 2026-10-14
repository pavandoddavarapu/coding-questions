class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left=0;
        
        Queue<Integer> q=new LinkedList<>();
        int right=0;
        int ans=0;
        int kk=k;
        while(right<answerKey.length()){
            char c=answerKey.charAt(right);
            if(c=='T'){
                right++;
                ans=Math.max(ans,right-left);
            }
            else if(k>0){
                k--;
                q.add(right);right++;
                ans=Math.max(ans,right-left);
            }
            else{
                if(!q.isEmpty()){
                    left=q.poll();k++;left++;
                }
                else{
                    left=right;right++;
                    k=kk;
                }
            }
        }
        k=kk;
        q.clear();
        left=0;right=0;
        while(right<answerKey.length()){
            char c=answerKey.charAt(right);
            if(c=='F'){
                right++;
                ans=Math.max(ans,right-left);
            }
            else if(k>0){
                k--;
                q.add(right);right++;
                ans=Math.max(ans,right-left);
            }
            else{
                if(!q.isEmpty()){
                    left=q.poll();k++;
                    left=left+1;
                }
                else{
                    left=right;right++;
                    k=kk;
                }
            }
        }
        return ans;
    }
}
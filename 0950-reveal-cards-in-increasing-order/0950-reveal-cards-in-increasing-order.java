class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);  // to get numbers in sorted order
        int i=0, idx=0, n=deck.length;
        int[] ans=new int[n];
        while(i<n)  // fill increasing first
        {
            ans[i]=deck[idx];
            i+=2;
            idx++;
        }
        Queue<Integer> q=new LinkedList<>();    // fill remaining indices 
        if(ans[n-1]==0)
        {
            q.add(n-1);
        }
        for(int j=0;j<n-1;j++)
        {
            if(ans[j]==0)   // add if index nit filled
            {
                q.add(j);
            }
        }
        while(!q.isEmpty())
        {
            q.add(q.remove());  // avoid first
            ans[q.remove()]=deck[idx++];    // fill next
        }
        return ans;
    }
}
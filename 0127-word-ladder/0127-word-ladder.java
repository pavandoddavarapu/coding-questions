class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> hs=new HashSet<>(wordList);
        HashSet<String> vis=new HashSet<>();
        Queue<String> q=new LinkedList<>();
        q.add(beginWord);
        int count=0;
        while(!q.isEmpty()){
            count++;
            int n=q.size();
            for(int i=0;i<n;i++){
            String st=q.poll();
            if(st.equals(endWord))return count;
            char c[]=st.toCharArray();
            for(int j=0;j<c.length;j++){
                char lm=c[j];
                for(char k='a';k<='z';k++){
                    c[j]=k;
                    String s=new String(c);
                    if(hs.contains(s) && !vis.contains(s)){
                        vis.add(s);
                        q.add(s);
                    }
                }
                c[j]=lm;
            }
            }
        }
        return 0;
    }
}
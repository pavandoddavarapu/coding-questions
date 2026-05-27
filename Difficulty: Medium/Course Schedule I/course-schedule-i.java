class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        // code here
        int counter[]=new int[n];
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<Integer>());
        }
        for(int i=0;i<prerequisites.length;i++){
            arr.get(prerequisites[i][0]).add(prerequisites[i][1]);
            counter[prerequisites[i][1]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(counter[i]==0)q.add(i);
        }
        ArrayList<Integer> ans=new ArrayList<Integer>();
        while(!q.isEmpty()){
            int a=q.poll();
            for(int i=0;i<arr.get(a).size();i++){
                int b=arr.get(a).get(i);
                counter[b]--;
                if(counter[b]==0)q.add(b);
            }
            ans.add(a);
        }
        return ans.size()==n;
    }
}
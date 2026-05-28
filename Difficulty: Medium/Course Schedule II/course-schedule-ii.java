class Solution {
    public ArrayList<Integer> findOrder(int n, int[][] prerequisites) {
        // code here
        int counter[]=new int[n];
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<Integer>());
        }
        for(int i=0;i<prerequisites.length;i++){
            arr.get(prerequisites[i][1]).add(prerequisites[i][0]);
            counter[prerequisites[i][0]]++;
        }
        Queue<Integer>q=new LinkedList<>();
        
        for(int i=0;i<n;i++){
            if(counter[i]==0){q.add(i);}
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int a=q.poll();
            ans.add(a);
            int nn=arr.get(a).size();
            for(int i=0;i<nn;i++){
                int b=arr.get(a).get(i);
                counter[b]--;
                if(counter[b]==0)q.add(b);
            }
        }
        return ans.size()==n?ans : new ArrayList<Integer>();
    }
}
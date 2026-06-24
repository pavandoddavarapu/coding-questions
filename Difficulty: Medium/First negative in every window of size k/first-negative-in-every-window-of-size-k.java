class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<k;i++){
            if(arr[i]<0)q.add(arr[i]);
        }
        List<Integer> ans=new ArrayList<>();
        if(q.isEmpty()){ans.add(0);}
        else{ans.add(q.peek());}
        for(int i=k;i<arr.length;i++){
            if(!q.isEmpty() && q.peek()==arr[i-k]){q.poll();}
            if(arr[i]<0)q.add(arr[i]);
            if(q.isEmpty()){ans.add(0);}
        else{ans.add(q.peek());}
        }
        return ans;
    }
}
/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> findSpiral(Node root) {
        // code here
        int i=0;
        Queue<Node> q=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int a=q.size();
            Stack<Integer> st=new Stack<>();
            for(int j=0;j<a;j++){
                Node r=q.poll();
                if(r.left!=null)q.add(r.left);
                if(r.right!=null)q.add(r.right);
                if(i%2!=0)ans.add(r.data);
                else{st.add(r.data);}
            }
            if(i%2==0){
                while(!st.isEmpty()){ans.add(st.pop());}
            }
            i++;
        }
        return ans;
    }
}
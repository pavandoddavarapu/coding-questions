/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        Stack<Node> st=new Stack<>();
        if(root!=null)st.push(root);
        while(!st.isEmpty()){
            while(root!=null && root.left!=null){
                st.push(root.left);
                root=root.left;
            }
            root=st.pop();
            arr.add(root.data);
            if(root.right!=null){st.push(root.right);}
            root=root.right;
        }
        return arr;
    }
}
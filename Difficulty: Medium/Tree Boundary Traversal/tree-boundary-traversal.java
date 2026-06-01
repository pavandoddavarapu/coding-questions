/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        
        ArrayList<Integer> arr=new ArrayList<>();
        if(root==null)return arr;
        if(root.left!=null || root.right!=null)arr.add(root.data);
        left(root,arr);
        bottom(root,arr);
        right(root,arr);
        return arr;
    }
    public void left(Node root, ArrayList<Integer> arr){
        
        root=root.left;
        while(root!=null){
            if(isLeaf(root))break;
            arr.add(root.data);
            if(root.left!=null)root=root.left;
            else if(root.right!=null)root=root.right;
            
        }
        
    }
    
    
    public void right(Node root, ArrayList<Integer> arr){
        ArrayList<Integer> sub=new ArrayList<>();
        root=root.right;
        while(root!=null){
            if(isLeaf(root))break;
            sub.add(root.data);
            if(root.right!=null)root=root.right;
            else if(root.left!=null)root=root.left;
            
        }
        Collections.reverse(sub);
        arr.addAll(sub);
    }
    
    public void bottom(Node root, ArrayList<Integer> arr){
            if(root==null)return;
            if(isLeaf(root))arr.add(root.data);
            bottom(root.left,arr);
            bottom(root.right,arr);
        
    }
    public boolean isLeaf(Node root){
        return (root.left==null && root.right==null);
    }
}
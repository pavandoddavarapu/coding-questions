// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {

    public int leftLeavesSum(Node root) {
        // Write your code here
        count=0;
        helper(root);
        return count;
    }
    int count=0;
    public int helper(Node root){
        if(root==null)return 0;
        if(root.left==null && root.right==null)return root.data;
        int left=helper(root.left);
        count=count+left;
        int right=helper(root.right);
        return 0;
        
        
    }
}
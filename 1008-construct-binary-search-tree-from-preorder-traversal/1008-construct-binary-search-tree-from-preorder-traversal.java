/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder,0,preorder.length-1);
    }
    
    public TreeNode helper(int[] preorder,int st,int end){
        if(st>end)return null;
        int i=st+1;
        TreeNode root=new TreeNode(preorder[st]);

        while(i<=end && preorder[st]>preorder[i]){
            i++;
        }
        root.right=helper(preorder,i,end);
        root.left=helper(preorder,st+1,i-1);
        return root;
    }
}
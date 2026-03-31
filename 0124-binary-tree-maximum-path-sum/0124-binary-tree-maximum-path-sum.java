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

    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxi;
    }
    int maxi=Integer.MIN_VALUE;
    public int helper(TreeNode root){
        if(root==null )return 0;
        int a=Math.max(0,helper(root.left));
        int b=Math.max(0,helper(root.right));
        maxi=Math.max(maxi,a+b+root.val);
        System.out.print(maxi+" ");
        return Math.max(a,b)+root.val;
    }
}
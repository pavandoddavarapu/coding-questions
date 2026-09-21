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
    public class pair{
        int count;
        int val;
        pair(int c,int v){
            this.count=c;
            this.val=v;
        }
    }
    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return ans;

    }
    int ans=0;
    public pair helper(TreeNode root){
        if(root==null){return new pair(0,0);}
        pair l=helper(root.left);
        pair r=helper(root.right);
        int c=l.count+r.count+1;
        int s=l.val+r.val+root.val;
        int k=s/c;
        if(k==root.val){ans=ans+1;}
        return new pair(c,s);
    }
}
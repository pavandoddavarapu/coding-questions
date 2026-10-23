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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> ans=new ArrayList<>();
        helper(root1,ans);
        helper(root2,ans);
        Collections.sort(ans);
        return ans;

    }
    public void helper(TreeNode root,ArrayList<Integer> arr){
        if(root==null)return ;
        arr.add(root.val);
        helper(root.left,arr);
        helper(root.right,arr);
    }
}
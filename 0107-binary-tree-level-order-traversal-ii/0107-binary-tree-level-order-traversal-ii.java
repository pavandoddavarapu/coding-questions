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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            int i=0;
            List<Integer> ls=new ArrayList<>();
            while(i<n){
            TreeNode node=q.poll();
            ls.add(node.val);
            if(node.left!=null)q.add(node.left);
            if(node.right!=null)q.add(node.right);i++;
            }
            ans.add(ls);
        }
        Collections.reverse(ans);
        return ans;
    }
}
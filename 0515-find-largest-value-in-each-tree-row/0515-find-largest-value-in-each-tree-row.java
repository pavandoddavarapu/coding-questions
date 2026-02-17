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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ls= new ArrayList<Integer>();
        if(root==null)return ls;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            int ans=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                TreeNode r=q.poll();
                ans=Math.max(ans,r.val);
                if(r.left!=null)q.add(r.left);
                if(r.right!=null)q.add(r.right);
            }
            ls.add(ans);
        }
        return ls;
    }
}
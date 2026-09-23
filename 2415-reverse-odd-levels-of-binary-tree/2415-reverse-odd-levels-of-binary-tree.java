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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int count=0;
        while(!q.isEmpty()){
            
            int n=q.size();
            LinkedList<TreeNode> ll=new LinkedList<>();
            for(int i=0;i<n;i++){
            TreeNode t=q.poll();
            if(t.left!=null)q.add(t.left);
            if(t.right!=null)q.add(t.right);
            if(count%2!=0)ll.add(t);
            }
            if(count%2!=0){
            while(ll.size()>1){
                TreeNode t1=ll.removeFirst();
                TreeNode t2=ll.removeLast();
                int temp=t1.val;
                t1.val=t2.val;
                t2.val=temp;
            }}
            count++;
        }
        return root;
    }
}
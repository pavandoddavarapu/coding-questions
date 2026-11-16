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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        int h=1;
        Queue<TreeNode> q=new LinkedList<>();
        if(depth==1){TreeNode t=new TreeNode(val);t.left=root;return t;}
        q.add(root);
        while(!q.isEmpty()){
            int a=q.size();
            if(h<depth-1){
                int j=0;
                while(j<a){
                    TreeNode t=q.poll();
                    if(t.left!=null)q.add(t.left);
                    if(t.right!=null)q.add(t.right);
                    j++;
                }
                h++;
            }
            else{
                int j=0;
                while(j<a){
                    TreeNode tt=q.poll();
                    if(tt.left!=null){
                        TreeNode t=new TreeNode(val);
                        t.left=tt.left;
                        tt.left=t;
                    }
                    else{tt.left=new TreeNode(val);}
                    if(tt.right!=null){
                        TreeNode t=new TreeNode(val);
                        t.right=tt.right;
                        tt.right=t;
                    }
                    else{tt.right=new TreeNode(val);}
                    j++;
                }
                break;
            }
        }
        return root;
    }
}
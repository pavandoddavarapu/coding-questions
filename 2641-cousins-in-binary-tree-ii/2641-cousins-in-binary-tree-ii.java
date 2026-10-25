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
    public TreeNode replaceValueInTree(TreeNode root) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        helper1(root,hm,0);
        
        helper2(root,hm,0);
        root.val=0;
        return root;
    }
    public void helper1(TreeNode root,HashMap<Integer,Integer> hm,int i){
        if(root==null)return;
        if(!hm.containsKey(i)){
            hm.put(i,root.val);
        }
        else{
            hm.put(i,hm.getOrDefault(i,0)+root.val);
        }
        helper1(root.left,hm,i+1);
        helper1(root.right,hm,i+1);
    }
    public void helper2(TreeNode root,HashMap<Integer,Integer> hm,int i){
        if(root==null)return;
        
        if(root.left!=null && root.right!=null){
            int val=hm.get(i+1)-root.left.val-root.right.val;
            root.left.val=val;
            root.right.val=val;
        }
        else if(root.left!=null){
            root.left.val=hm.get(i+1)-root.left.val;
        }
        else if(root.right!=null){
            root.right.val=hm.get(i+1)-root.right.val;
        }
       

        helper2(root.left,hm,i+1);
        helper2(root.right,hm,i+1);
    }
}
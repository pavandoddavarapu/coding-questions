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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashSet<Integer> hs=new HashSet<>();
        HashMap<Integer,TreeNode> hm=new HashMap<>();

        TreeNode root=new TreeNode(0);
        for(int[] a:descriptions){
            int p=a[0];
            int c=a[1];
            if(!hm.containsKey(p)){hm.put(p,new TreeNode(p));hs.add(p);}
            if(!hm.containsKey(c)){hm.put(c,new TreeNode(c));hs.add(c);}
            if(a[2]==1){
                hm.get(p).left=(hm.get(c));
            }
            else{
                hm.get(p).right=hm.get(c);
            }
        }
        for(int[] a:descriptions){
            hs.remove(a[1]);
        }
        for(int a:hs){
            return hm.get(a);
        }
        return root;
    }
}
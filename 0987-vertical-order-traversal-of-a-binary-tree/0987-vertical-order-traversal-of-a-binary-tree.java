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
    int small=100001;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        List<List<Integer>> ls=new ArrayList<>();
        helper(root,0,hm);
        for(int i=small;hm.containsKey(i);i++){
            ArrayList<Integer> a=new ArrayList<>(hm.get(i));
            Collections.sort(a);
            ls.add(a);
        }
        System.out.print(hm);
        return ls;

    }
    public void helper(TreeNode root,int i, HashMap<Integer,ArrayList<Integer>> hm){
        if(root==null){
            return;
        }
        else{
            if(hm.containsKey(i)){hm.get(i).add(root.val);}

            else{
                ArrayList<Integer> ls=new ArrayList<>();
                ls.add(root.val);
                hm.put(i,ls);}
        }
        if(i<small)small=i;
        helper(root.left,i-1,hm);
        helper(root.right,i+1,hm);
        return;
    }
}
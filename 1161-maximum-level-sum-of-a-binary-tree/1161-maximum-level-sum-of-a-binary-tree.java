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
        TreeNode tn;
        int level;
        pair(TreeNode tn,int level){
            this.tn=tn;
            this.level=level;
            
        }
    }
    public int maxLevelSum(TreeNode root) {
        Queue<pair> q=new LinkedList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        q.add(new pair(root,1));
        int m=Integer.MIN_VALUE;
        int l=0;
        while(!q.isEmpty()){
            pair p=q.poll();
            if(hm.containsKey(p.level)){
                int sum=hm.get(p.level)+p.tn.val;
                hm.put(p.level,sum);
               
            }
            else{
                hm.put(p.level,p.tn.val);
                int sum=p.tn.val;
            }
            if(p.tn.left!=null){
                q.add(new pair(p.tn.left,p.level+1));
            }
            if(p.tn.right!=null){
                q.add(new pair(p.tn.right,p.level+1));
            }
        }
        for (int key : hm.keySet()) {
    if (hm.get(key) > m) {
        m = hm.get(key);
        l = key;
    }
}

        return l;
    }
}
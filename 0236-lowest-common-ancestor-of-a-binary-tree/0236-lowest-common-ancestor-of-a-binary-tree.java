/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        HashMap<TreeNode,TreeNode>parent=new HashMap<>();
        buildparent(root,null,parent);
        HashSet<TreeNode> set=new HashSet<>();
        while(p!=null){
            set.add(p);
            p=parent.get(p);
        }
        while(!set.contains(q)){
            q=parent.get(q);
        }
        return q;
        
    }
    private void buildparent(TreeNode root,TreeNode parent,HashMap<TreeNode,TreeNode> map){
        if(root==null){
            return;
        }
        map.put(root,parent);
        buildparent(root.left,root,map);
        buildparent(root.right,root,map);
    }
}
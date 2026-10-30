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
    public void flatten(TreeNode root) {
        
        TreeNode current=root;
        while(current!=null){
            if(current.left!=null){
            TreeNode temp=current.right;
            current.right=current.left;
            current.left=null;
            TreeNode rightmost=Rightmost(current);
            rightmost.right=temp;
        }
        current=current.right;
        }
        
    }
    private TreeNode Rightmost(TreeNode node){
        while(node.right!=null){
            node=node.right;
        }
        return node;
    }
}
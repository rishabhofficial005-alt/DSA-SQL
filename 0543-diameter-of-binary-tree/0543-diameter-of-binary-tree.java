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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        heightoftree(root);
        return diameter;
        
    }
    private int heightoftree(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftheight=heightoftree(root.left);
        int rightheight=heightoftree(root.right);
        diameter=Math.max(diameter,leftheight+rightheight);
        return 1+ Math.max(leftheight,rightheight);
    }
}
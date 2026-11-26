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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        inorder(root1,arr1);
        inorder(root2,arr2);
        int i=0; int j=0;
        List<Integer> merged=new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<arr2.get(j)){
                merged.add(arr1.get(i));
                i++;
            }
            else{
                merged.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            merged.add(arr1.get(i));
            i++;

        }
        while(j<arr2.size()){
            merged.add(arr2.get(j));
            j++;
        }
        return merged;

    }
    private void inorder(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
   
        
}

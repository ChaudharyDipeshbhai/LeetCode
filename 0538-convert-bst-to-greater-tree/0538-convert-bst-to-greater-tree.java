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
    int tem=0;
    public TreeNode convertBST(TreeNode root) {
        opinorder(root);
        return root;
    }
    public void opinorder(TreeNode root){
        if(root==null){
            return;
        }
        if(root.right!=null){
            opinorder(root.right);
        }
        tem+=root.val;
        root.val=tem;
        if(root.left!=null){
            opinorder(root.left);
        }
    }
}
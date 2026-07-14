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
    public int maxDepth(TreeNode root) {
        return depthCount(root);        
    }

    private int depthCount(TreeNode node){
        if(node == null) return 0;
        int l = 1 + depthCount(node.left);
        int r = 1 + depthCount(node.right);
        return Math.max(l,r);
    }
}
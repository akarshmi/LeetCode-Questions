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
    private boolean ans = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        solve(root,targetSum);
        return ans;
    }

    private void solve(TreeNode root , int t){

        if(root == null) return;

         if (root.left == null && root.right == null) {
            if (t == root.val) {
                ans = true;
            }
         }else{
            solve(root.left,t-root.val);
            solve(root.right,t-root.val);
        }
    }
}
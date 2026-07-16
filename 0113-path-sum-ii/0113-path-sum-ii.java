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
    private List<List<Integer>> ans;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans = new ArrayList<>();
        solve(root, targetSum, new ArrayList<>());
        return ans;
    }

    private void solve(TreeNode root, int target, List<Integer> path) {
        if (root == null) return;

        // 1. Add current node to path
        path.add(root.val);   

        // 2. If leaf and sum matches, store a copy of the path
        if (root.left == null && root.right == null) {
            if (target == root.val) {
                ans.add(new ArrayList<>(path));
            }
        } else {
            // 3. Recurse on children with reduced target
            solve(root.left, target - root.val, path);
            solve(root.right, target - root.val, path);
        }

        // 4. Backtrack: remove current node before returning
        path.remove(path.size() - 1);
    }
}
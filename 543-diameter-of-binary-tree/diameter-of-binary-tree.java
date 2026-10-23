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
        int maxDist = 0;
        private int findDepth(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int leftPath = findDepth(node.left);
            int rightPath = findDepth(node.right);
            if (leftPath + rightPath > maxDist) {
                maxDist = leftPath + rightPath;
            }
            return 1 + Math.max(leftPath, rightPath);
        }

    public int diameterOfBinaryTree(TreeNode root) {

            maxDist = 0;
            findDepth(root);
            return maxDist;
    }
}
package BinaryTree;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-14
 * @LastEditors: mianmiantea2019
 * @Description:
 */

class _226InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // Swap the left and right subtrees
        root.left = right;
        root.right = left;
        return root;
    }
}

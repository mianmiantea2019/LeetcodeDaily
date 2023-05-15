package BinaryTree;


/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-15
 * @LastEditors: mianmiantea2019
 * @Description:
 */
public class _235LowestCommonAncestorofaBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
      
        TreeNode p2 = root.left.right.right;
        TreeNode q2 = root.right.right;
        _235LowestCommonAncestorofaBinarySearchTree lca = new _235LowestCommonAncestorofaBinarySearchTree();
        TreeNode lcaNode = lca.lowestCommonAncestor(root, p2, q2);
    }
}

package BinaryTree;

import java.util.*;

/**
 * @Author: mianmiantea2019
 * @Date: 2023-05-15
 * @LastEditors: mianmiantea2019
 * @Description:
 */

public class _110BalancedBinaryTree {
   public boolean isBalanced1(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isBalancedHelper(root) != -1;
    }

  private int isBalancedHelper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = isBalancedHelper(node.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = isBalancedHelper(node.right);
        if (rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

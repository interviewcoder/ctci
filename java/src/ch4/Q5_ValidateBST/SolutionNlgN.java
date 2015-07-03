/**
 * Time: O(NlgN); Space: O()
 *************************************************************************
 * Description:
 * 
 * Implement a function to check if a binary tree is a binary search tree.
 * 
 * any number from left subtree <= root.val < any number from right subtree
 *
 *************************************************************************
 * @tag  : Tree; Depth-first Search
 * @date : Jun 29, 2015
 */
package ch4.Q5_ValidateBST;

import com.careercup.TreeNode;

/** see test {@link ch4.Q5_ValidateBST.SolutionNlgNTest } */
public class SolutionNlgN {

    boolean isValidBST(TreeNode root) {
        // base case
        if (root == null) {
            return true;
        }
        // recursive case: in-order traversal
        boolean isValid = true;
        if (isValid && root.left != null) {
            TreeNode node = root.left;
            while (node.right != null) {
                node = node.right;
            }
            isValid = node.val <= root.val;
        }
        if (isValid && root.right != null) {
            TreeNode node = root.right;
            while (node.left != null) {
                node = node.left;
            }
            isValid = node.val > root.val;
        }
        return isValid && isValidBST(root.left) && isValidBST(root.right);
    }

}

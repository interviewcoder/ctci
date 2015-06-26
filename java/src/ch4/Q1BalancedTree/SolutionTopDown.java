/**
 * Time: O(NlgN); Space: O()
 * @tag: Depth-first Search; Tree
 * @date: 
 */
package ch4.Q1BalancedTree;

import com.careercup.TreeNode;

public class SolutionTopDown {
    public int getTreeHeight(TreeNode root) {
        // base case
        if (root == null) {
            return 0;
        }
        // recursive case
        return 1 + Math.max(getTreeHeight(root.left), getTreeHeight(root.right));
    }
    
    public boolean isBalancedTree(TreeNode root) {
        // base case
        if (root == null) {
            return true;
        }
        // recursive case: top-down traversal
        return Math.abs(getTreeHeight(root.left) - getTreeHeight(root.right)) <= 1
                && isBalancedTree(root.left)
                && isBalancedTree(root.right);
    }
}

/**
 * Time: O(); Space: O()
 *************************************************************************
 * Description:
 * 
 * Write an algorithm to find the 'next' node (i.e., in-order successor) 
 * of a given node in a binary search tree. You may assume that each node
 * has a link to its parent
 *
 *************************************************************************
 * @tag  : Tree; 
 * @date : Jun 30, 2015
 */
package ch4.Q6_FindNextNode;

import com.careercup.TreeNodeWithParent;

/** see test {@link ch4.Q6_FindNextNode.SolutionTest } */
public class Solution {
    public TreeNodeWithParent findNextNode(TreeNodeWithParent node) {
        if (node == null) {
            // null node
            return null;
        } else if (node.parent == null) {
            // root node
            return node.right;
        } else if (node.right != null) {
            // find the leftmost node
            TreeNodeWithParent n = node.right;
            while (n.left != null) {
                n = n.left;
            }
            return n;
        } else {
            // move node upwards
            TreeNodeWithParent n = node;
            while (n.parent != null && n.parent.right == n) {
                n = n.parent;
            }
            return n.parent;
        }
    }
}

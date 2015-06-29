/**
 * Time: O(); Space: O()
 *************************************************************************
 * Description:
 * 
 * Given a binary tree, design an algorithm which creates a linked list
 * of all the nodes at each depth. (e.g., if you have a tree with depth D,
 * you'll have D linked lists).
 *
 *************************************************************************
 * @tag  : Linked List; Tree
 * @date : Jun 28, 2015
 */
package ch4.Q4_GetNodesAtEachDepth;

import java.util.ArrayList;
import java.util.List;

import com.careercup.TreeNode;

/** see test {@link ch4.Q4_GetNodesAtEachDepth.SolutionBFSTest } */
public class SolutionBFS {

    public List<List<TreeNode>> getNodesAtEachDepth(TreeNode root) {
        List<List<TreeNode>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<TreeNode> curLevel = new ArrayList<>();
        curLevel.add(root);
        while (!curLevel.isEmpty()) {
            // add previous level
            result.add(curLevel);
            // go to next level
            List<TreeNode> parents = curLevel;
            curLevel = new ArrayList<>();
            for (TreeNode parent : parents) {
                if (parent.left != null) {
                    curLevel.add(parent.left);
                }
                if (parent.right != null) {
                    curLevel.add(parent.right);
                }
            }

        }
        return result;
    }

}

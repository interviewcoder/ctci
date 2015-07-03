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
package ch4.Q3_ListOfDepths;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.careercup.TreeNode;

/** see test {@link ch4.Q3_ListOfDepths } */
public class SolutionWrong {

    public List<List<TreeNode>> getNodesAtEachDepth(TreeNode root) {
        List<List<TreeNode>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> curLevel = new LinkedList<>();
        curLevel.add(root);
        List<TreeNode> depthNodes = new ArrayList<>();
        depthNodes.add(root);
        result.add(depthNodes);
        while (!curLevel.isEmpty()) {
            depthNodes = new ArrayList<>();
            Queue<TreeNode> nextLevel = new LinkedList<>();
            while (!curLevel.isEmpty()) {
                TreeNode node = curLevel.poll();
                if (node != null) {
                    depthNodes.add(new TreeNode(node.val));
                }
                nextLevel.add(node.left);
                nextLevel.add(node.right);
            }
            if (!nextLevel.isEmpty()) {
                curLevel = nextLevel;
            }
            // go to next level
            result.add(new ArrayList<>(depthNodes));
        }
        return result;
    }

}

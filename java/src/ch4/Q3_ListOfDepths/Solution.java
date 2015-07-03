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
import java.util.Arrays;
import java.util.List;

import com.careercup.TreeNode;

/** see test {@link ch4.Q3_ListOfDepths.SolutionTest } */
public class Solution {

    public List<List<TreeNode>> getNodesAtEachDepth(TreeNode root) {
        List<List<TreeNode>> result = new ArrayList<>();
        int level = 1;
        getNodesAtEachDepth(root, level, result);
        return result;
    }

    private void getNodesAtEachDepth(TreeNode root, int level,
            List<List<TreeNode>> result) {
        // base case
        if (root == null || level < 0) {
            return;
        }
        // recursive case
        if (result.size() < level) {
            // first node in this level
            result.add(new ArrayList<>(Arrays.asList(root)));
        } else {
            List<TreeNode> list = result.get(level - 1);
            list.add(root);
        }
        getNodesAtEachDepth(root.left, level + 1, result);
        getNodesAtEachDepth(root.right, level + 1, result);
    }

}

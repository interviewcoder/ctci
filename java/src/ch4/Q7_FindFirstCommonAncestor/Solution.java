/**
 * Time: O(); Space: O()
 *************************************************************************
 * Description:
 * 
 * Design an algorithm and write code to find the first common ancestor of
 * two nodes in a binary tree. Avoid storing additional nodes in a data
 * structure. 
 * 
 * Note: This is not necessarily a binary search tree.
 *
 *************************************************************************
 * @tag  : Tree; Depth-first Search
 * @date : Jul 3, 2015
 */
package ch4.Q7_FindFirstCommonAncestor;

import java.util.ArrayList;
import java.util.List;

import com.careercup.TreeNode;

public class Solution {
    
    private List<TreeNode> path = new ArrayList<>();
    
    private boolean foundNode1 = false;

    private boolean foundNode2 = false;
    
    private List<TreeNode> path1 = new ArrayList<>();

    private List<TreeNode> path2 = new ArrayList<>();
    
    /**
     * Simulating the way to find common ancestor for trees with parent node.
     * Firstly, building paths for node1 and node2, and then find the 
     * 1st common node in the path
     */
    public TreeNode commonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
        if (root == null) {
            return null;
        }
        findTwoNodes(root, n1, n2, path);
        return findCommonAncestor(path1, path2);
    }

    
    // p1: root -> ... -> node
    //                     | <- index to start searching
    // p2: root -> ... -> node -> ...
    private TreeNode findCommonAncestor(List<TreeNode> p1,
            List<TreeNode> p2) {
        if (p1.size() > p2.size()) {
            // let p1 be the shorter list
            return findCommonAncestor(p2, p1);
        }
        int index = p1.size() - 1;
        while (index >= 0) {
            if (p1.get(index) == p2.get(index)) {
                return p1.get(index);
            }
            index--;
        }
        return null;
    }

    // find the path for node1 and node2
    private void findTwoNodes(TreeNode root, TreeNode n1, TreeNode n2,
            List<TreeNode> path) {
        if (root == null || (foundNode1 && foundNode2)) {
            // base case
            return;
        }
        path.add(root);
        if (!foundNode1 && root == n1) {
            // found node1
            foundNode1 = true;
            path1 = new ArrayList<>(path);
        }
        if (!foundNode2 && root == n2) {
            // found node2
            foundNode2 = true;
            path2 = new ArrayList<>(path);
        }
        findTwoNodes(root.left, n1, n2, path);
        findTwoNodes(root.right, n1, n2, path);
        path.remove(path.size() - 1);
    }

}

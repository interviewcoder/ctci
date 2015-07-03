/**
 * Time: O(N); Space: O()
 *************************************************************************
 * Description:
 * 
 * Given a sorted (increasing order) array of unique integer elements, 
 * write an algorithm to create a binary search tree with minimal height.
 *
 *************************************************************************
 * @tag  : Array; Tree
 * @date : Jun 28, 2015
 */
package ch4.Q2_MinimalTree;

import com.careercup.TreeNode;

/** see test {@link ch4.Q2_MinimalTree.SolutionTest } */
public class Solution {

    public TreeNode convertToBST(int[] nums) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        return convertToBST(nums, start, end);
    }

    private TreeNode convertToBST(int[] nums, int start, int end) {
        // base case
        if (start > end) {
            return null;
        }
        // recursive case: use middle number as root
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        // numbers in nums[start, mid - 1] will be converted to left subtree
        root.left = convertToBST(nums, start, mid - 1);
        root.right = convertToBST(nums, mid + 1, end);
        return root;
    }

}

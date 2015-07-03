package ch4.Q2_MinimalTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import ch4.Q2_MinimalTree.Solution;

import com.careercup.TreeNode;

public class SolutionTest {

    /** Test method for {@link ch4.Q2_MinimalTree.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }
    
    //  null
    @Test
    public void Test1() {
        int[] nums = {};
        TreeNode expected = null;
        assertTrue(TreeNode.isSameTree(expected, solution.convertToBST(nums)));
    }
    
    //  1
    @Test
    public void Test2() {
        int[] nums = {1};
        TreeNode expected = new TreeNode(1);
        assertTrue(TreeNode.isSameTree(expected, solution.convertToBST(nums)));
    }
    
    //    2
    //   / \
    //  1   3
    @Test
    public void Test3() {
        int[] nums = {1, 2, 3};
        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode.connect(e2, e1, e3);
        TreeNode expected = e2;
        assertTrue(TreeNode.isSameTree(expected, solution.convertToBST(nums)));
    }
    
    //      4 
    //    /   \
    //   2     6
    //  / \   / \
    // 1   3 5   7
    @Test
    public void Test4() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode e4 = new TreeNode(4);
        TreeNode e5 = new TreeNode(5);
        TreeNode e6 = new TreeNode(6);
        TreeNode e7 = new TreeNode(7);
        TreeNode.connect(e4, e2, e6);
        TreeNode.connect(e2, e1, e3);
        TreeNode.connect(e6, e5, e7);
        TreeNode expected = e4;
        assertTrue(TreeNode.isSameTree(expected, solution.convertToBST(nums)));
    }

    //    2        1
    //   /    or    \
    //  1            2 
    @Test
    public void Test5() {
        int[] nums = {1, 2};
        TreeNode e11 = new TreeNode(1);
        TreeNode e12 = new TreeNode(2);
        TreeNode.connect(e12, e11, null);
        TreeNode expected1 = e12;
       
        TreeNode e21 = new TreeNode(1);
        TreeNode e22 = new TreeNode(2);
        TreeNode.connect(e21, null, e22);
        TreeNode expected2 = e21;
        
        TreeNode actual = solution.convertToBST(nums);
        assertTrue(TreeNode.isSameTree(expected1, actual)
                || TreeNode.isSameTree(expected2, actual));
    }

    //    2             3           2            3
    //   / \           / \        /   \        /   \
    //  1   3    or   2   4  or  1     4  or  1     4
    //       \       /                /        \
    //        4     1                3          2
    @Test
    public void Test6() {
        int[] nums = {1, 2, 3, 4};
        TreeNode e11 = new TreeNode(1);
        TreeNode e12 = new TreeNode(2);
        TreeNode e13 = new TreeNode(3);
        TreeNode e14 = new TreeNode(4);
        TreeNode.connect(e12, e11, e13);
        TreeNode.connect(e13, null, e14);
        TreeNode expected1 = e12;
       
        TreeNode e21 = new TreeNode(1);
        TreeNode e22 = new TreeNode(2);
        TreeNode e23 = new TreeNode(3);
        TreeNode e24 = new TreeNode(4);
        TreeNode.connect(e23, e22, e24);
        TreeNode.connect(e22, e21, null);
        TreeNode expected2 = e23;
        
        TreeNode e31 = new TreeNode(1);
        TreeNode e32 = new TreeNode(2);
        TreeNode e33 = new TreeNode(3);
        TreeNode e34 = new TreeNode(4);
        TreeNode.connect(e32, e31, e34);
        TreeNode.connect(e34, e33, null);
        TreeNode expected3 = e32;

        TreeNode e41 = new TreeNode(1);
        TreeNode e42 = new TreeNode(2);
        TreeNode e43 = new TreeNode(3);
        TreeNode e44 = new TreeNode(4);
        TreeNode.connect(e43, e41, e44);
        TreeNode.connect(e41, null, e42);
        TreeNode expected4 = e43;

        TreeNode actual = solution.convertToBST(nums);
        assertTrue(TreeNode.isSameTree(expected1, actual)
                || TreeNode.isSameTree(expected2, actual)
                || TreeNode.isSameTree(expected3, actual)
                || TreeNode.isSameTree(expected4, actual));
    }

}

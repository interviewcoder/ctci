package ch4.Q1BalancedTree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.careercup.TreeNode;

public class PracticeTest {
    
    Practice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new Practice();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    //  null
    @Test
    public void Test0() {
        TreeNode root = null;
        boolean actual = solution.isBalancedTree(root);
        assertTrue(actual);
    }

    //  1
    @Test
    public void Test1() {
        TreeNode root = new TreeNode(1);
        boolean actual = solution.isBalancedTree(root);
        assertTrue(actual);
    }
    

    //   1 
    //    \
    //     2
    //      \
    //       3 
    @Test
    public void Test2() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        TreeNode root = t1;
        boolean actual = solution.isBalancedTree(root);
        assertTrue(!actual);
    }

    //      1 
    //     /   
    //    2
    //   / 
    //  3 
    @Test
    public void Test3() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        TreeNode root = t1;
        boolean actual = solution.isBalancedTree(root);
        assertTrue(!actual);
    }

    //      1 
    //    /   \
    //   2     3
    @Test
    public void Test4() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, t2, t3);
        TreeNode root = t1;
        boolean actual = solution.isBalancedTree(root);
        assertTrue(actual);
    }
    
    //        5
    //      /   \
    //     4     8
    //    /     /  \
    //   11    13   4
    //  /  \       / \
    // 7    2     5   1
    @Test
    public void Test5() {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(11);
        TreeNode t5 = new TreeNode(13);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(2);
        TreeNode t9 = new TreeNode(5);
        TreeNode t10 = new TreeNode(1);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, null);
        TreeNode.connect(t3, t5, t6);
        TreeNode.connect(t4, t7, t8);
        TreeNode.connect(t6, t9, t10);
        TreeNode root = t1;
        boolean actual = solution.isBalancedTree(root);
        assertTrue(!actual);
    }
    
    //  1
    //    \
    //      2
    //     /
    //    3
    @Test
    public void Test6() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode.connect(n1, null, n2);
        TreeNode.connect(n2, n3, null);
        TreeNode root = n1;
        boolean actual = solution.isBalancedTree(root);
        assertTrue(!actual);
    }

    //        5
    //      /   \
    //     4     8
    //         /  \
    //       13    4
    //            / \
    //           5   1
    @Test
    public void Test7() {
        TreeNode root = TreeNode.getTree10();
        boolean actual = solution.isBalancedTree(root);
        assertTrue(!actual);
    }


}

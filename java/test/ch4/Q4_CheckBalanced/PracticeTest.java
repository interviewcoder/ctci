package ch4.Q4_CheckBalanced;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import ch4.Q4_CheckBalanced.Practice;

import com.careercup.TreeNode;

public class PracticeTest {
    
    /** Test method for {@link ch4.Q4_CheckBalanced.Practice } */
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

    // 1 
    @Test
    public void Test1() {
        TreeNode root = TreeNode.getTree0();
        assertTrue(solution.isValidBST(root));
    }

    //   1 
    //    \
    //     2
    //      \
    //       3 
    @Test
    public void Test2() {
        TreeNode root = TreeNode.getTree1();
        assertTrue(solution.isValidBST(root));
    }

    //   3 
    //    \
    //     2
    //      \
    //       1 
    @Test
    public void Test3() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(1);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        TreeNode root = t1;
        assertTrue(!solution.isValidBST(root));
    }

    //      1 
    //     /   
    //    2
    //   / 
    //  3 
    @Test
    public void Test4() {
        TreeNode root = TreeNode.getTree0();
        assertTrue(!solution.isValidBST(root));
    }

    //      3 
    //     /   
    //    2
    //   / 
    //  1 
    @Test
    public void Test5() {
        TreeNode t1 = new TreeNode(3);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(1);
        TreeNode.connect(t1, t3, null);
        TreeNode.connect(t3, t4, null);
        TreeNode root = t1;
        assertTrue(solution.isValidBST(root));
    }

    //      1 
    //    /   \
    //   2     3
    @Test
    public void Test6() {
        TreeNode root = TreeNode.getTree0();
        assertTrue(!solution.isValidBST(root));
    }

    //      2 
    //    /   \
    //   1     3
    @Test
    public void Test7() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, t2, t3);
        TreeNode root = t1;
        assertTrue(solution.isValidBST(root));
    }

    //        5
    //      /   \
    //     4     8
    //    /     /  \
    //   11    13   4
    //  /  \       / \
    // 7    2     5   1
    @Test
    public void Test8() {
        TreeNode root = TreeNode.getTree4();
        assertTrue(!solution.isValidBST(root));
    }

    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7
    @Test
    public void Test9() {
        TreeNode root = TreeNode.getTree5();
        assertTrue(solution.isValidBST(root));
    }

    //  1
    //    \
    //      2
    //     /
    //    3
    @Test
    public void Test10() {
        TreeNode root = TreeNode.getTree8();
        assertTrue(solution.isValidBST(root));
    }

}

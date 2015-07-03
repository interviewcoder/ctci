package ch4.Q7_FindFirstCommonAncestor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.careercup.TreeNode;

public class SolutionTest {
    
    /** Test method for {@link ch4.Q7_FindFirstCommonAncestor.Solution } */
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

    //      1 
    //    /   \
    //   2     3
    @Test
    public void Test0() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode.connect(t1, t2, t3);
        TreeNode root = t1;
        TreeNode actual = solution.commonAncestor(root, t2, t4);
        TreeNode expected = null;
        assertEquals(expected, actual);
    }

    //      1 
    //     /   
    //    2
    //   / 
    //  3 
    @Test
    public void Test1() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        TreeNode root = t1;
        TreeNode actual = solution.commonAncestor(root, t2, t3);
        TreeNode expected = t2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        TreeNode root = t1;
        TreeNode actual = solution.commonAncestor(root, t1, t3);
        TreeNode expected = t1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        TreeNode root = t1;
        TreeNode actual = solution.commonAncestor(root, t1, t2);
        TreeNode expected = t1;
        assertEquals(expected, actual);
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
        TreeNode actual = solution.commonAncestor(root, t2, t3);
        TreeNode expected = t1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        TreeNode root = t1;
        TreeNode actual = solution.commonAncestor(root, t1, t3);
        TreeNode expected = t1;
        assertEquals(expected, actual);
    }

    //        5
    //      /   \
    //     4     8
    //    /     /  \
    //   11    13   4
    //  /  \       / \
    // 7    2     5   1
    @Test
    public void Test6() {
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
        TreeNode actual = solution.commonAncestor(root, t1, t6);
        TreeNode expected = t1;
        assertEquals(expected, actual);
    }

    //        5
    //      /   \
    //     4     8
    //    /     /  \
    //   11    13   4
    //  /  \       / \
    // 7    2     5   1
    @Test
    public void Test7() {
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
        TreeNode actual = solution.commonAncestor(root, t4, t6);
        TreeNode expected = t1;
        assertEquals(expected, actual);
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
        TreeNode actual = solution.commonAncestor(root, t5, t9);
        TreeNode expected = t3;
        assertEquals(expected, actual);
    }

    //        5
    //      /   \
    //     4     8
    //    /     /  \
    //   11    13   4
    //  /  \       / \
    // 7    2     5   1
    @Test
    public void Test9() {
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
        TreeNode actual = solution.commonAncestor(root, t7, t8);
        TreeNode expected = t4;
        assertEquals(expected, actual);
    }

}

package ch4.Q4_GetNodesAtEachDepth;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.careercup.TreeNode;

public class SolutionBFSTest {

    /** Test method for {@link ch4.Q4_GetNodesAtEachDepth.SolutionBFS } */
    SolutionBFS solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionBFS();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    // 1
    @Test
    public void Test0() {
        TreeNode root = TreeNode.getTree0();
        List<List<TreeNode>> actual = solution.getNodesAtEachDepth(root);
        List<List<TreeNode>> expected = new ArrayList<>();
        expected.add(Arrays.asList(new TreeNode(1)));
        assertEquals(expected.toString(), actual.toString());
    }

    // 1
    //  \
    //   2
    //    \
    //     3
    @Test
    public void Test1() {
        TreeNode root = TreeNode.getTree1();
        List<List<TreeNode>> actual = solution.getNodesAtEachDepth(root);
        List<List<TreeNode>> expected = new ArrayList<>();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, null, t3);
        expected.add(Arrays.asList(t1));
        expected.add(Arrays.asList(t2));
        expected.add(Arrays.asList(t3));
        assertEquals(expected.toString(), actual.toString());
    }

    //      1 
    //     /   
    //    2
    //   / 
    //  3 
    @Test
    public void Test2() {
        TreeNode root = TreeNode.getTree2();
        List<List<TreeNode>> actual = solution.getNodesAtEachDepth(root);
        List<List<TreeNode>> expected = new ArrayList<>();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, t2, null);
        TreeNode.connect(t2, t3, null);
        expected.add(Arrays.asList(t1));
        expected.add(Arrays.asList(t2));
        expected.add(Arrays.asList(t3));
        assertEquals(expected.toString(), actual.toString());
    }

    //      1 
    //    /   \
    //   2     3
    @Test
    public void Test3() {
        TreeNode root = TreeNode.getTree3();
        List<List<TreeNode>> actual = solution.getNodesAtEachDepth(root);
        List<List<TreeNode>> expected = new ArrayList<>();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, t2, t3);
        expected.add(Arrays.asList(t1));
        expected.add(Arrays.asList(t2, t3));
        assertEquals(expected.toString(), actual.toString());
    }

    //        5
    //      /   \
    //     4     8
    //    /     /  \
    //   11    13   4
    //  /  \       / \
    // 7    2     5   1
    @Test
    public void Test4() {
        TreeNode root = TreeNode.getTree4();
        List<List<TreeNode>> actual = solution.getNodesAtEachDepth(root);
        List<List<TreeNode>> expected = new ArrayList<>();
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
        expected.add(Arrays.asList(t1));
        expected.add(Arrays.asList(t2, t3));
        expected.add(Arrays.asList(t4, t5, t6));
        expected.add(Arrays.asList(t7, t8, t9, t10));
        assertEquals(expected.toString(), actual.toString());
    }

    //      10
    //     /  \
    //    5   12
    //   / \
    //  4   7
    @Test
    public void Test5() {
        TreeNode root = TreeNode.getTree5();
        List<List<TreeNode>> actual = solution.getNodesAtEachDepth(root);
        List<List<TreeNode>> expected = new ArrayList<>();
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(12);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(7);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, t4, t5);
        expected.add(Arrays.asList(t1));
        expected.add(Arrays.asList(t2, t3));
        expected.add(Arrays.asList(t4, t5));
        assertEquals(expected.toString(), actual.toString());
    }

    //  1
    //    \
    //      2
    //     /
    //    3
    @Test
    public void Test6() {
        TreeNode root = TreeNode.getTree8();
        List<List<TreeNode>> actual = solution.getNodesAtEachDepth(root);
        List<List<TreeNode>> expected = new ArrayList<>();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode.connect(t1, null, t2);
        TreeNode.connect(t2, t3, null);
        expected.add(Arrays.asList(t1));
        expected.add(Arrays.asList(t2));
        expected.add(Arrays.asList(t3));
        assertEquals(expected.toString(), actual.toString());
    }

    //       1
    //     /   \
    //    2     3
    //   / \   / \
    //  4  5  6   7
    @Test
    public void Test7() {
        TreeNode root = TreeNode.getTree9();
        List<List<TreeNode>> actual = solution.getNodesAtEachDepth(root);
        List<List<TreeNode>> expected = new ArrayList<>();
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode.connect(n1, n2, n3);
        TreeNode.connect(n2, n4, n5);
        TreeNode.connect(n3, n6, n7);
        expected.add(Arrays.asList(n1));
        expected.add(Arrays.asList(n2, n3));
        expected.add(Arrays.asList(n4, n5, n6, n7));
        assertEquals(expected.toString(), actual.toString());
    }

    //        5
    //      /   \
    //     4     8
    //         /  \
    //       13    4
    //            / \
    //           5   1
    @Test
    public void Test8() {
        TreeNode root = TreeNode.getTree10();
        List<List<TreeNode>> actual = solution.getNodesAtEachDepth(root);
        List<List<TreeNode>> expected = new ArrayList<>();
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(8);
        TreeNode t5 = new TreeNode(13);
        TreeNode t6 = new TreeNode(4);
        TreeNode t9 = new TreeNode(5);
        TreeNode t10 = new TreeNode(1);
        TreeNode.connect(t1, t2, t3);
        TreeNode.connect(t2, null, null);
        TreeNode.connect(t3, t5, t6);
        TreeNode.connect(t6, t9, t10);
        expected.add(Arrays.asList(t1));
        expected.add(Arrays.asList(t2, t3));
        expected.add(Arrays.asList(t5, t6));
        expected.add(Arrays.asList(t9, t10));
        assertEquals(expected.toString(), actual.toString());
    }

}

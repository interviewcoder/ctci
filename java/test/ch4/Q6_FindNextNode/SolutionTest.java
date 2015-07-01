package ch4.Q6_FindNextNode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.careercup.TreeNodeWithParent;

public class SolutionTest {
    
    /** Test method for {@link ch4.Q6_FindNextNode.Solution } */
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

    @Test
    public void Test0() {
        TreeNodeWithParent t1 = null;
        TreeNodeWithParent actual = solution.findNextNode(t1);
        assertEquals(null, actual);
    }

    //   1
    @Test
    public void Test1() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent actual = solution.findNextNode(t1);
        assertEquals(null, actual);
    }

    //      1
    //    /
    //  2
    @Test
    public void Test2() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent t2 = new TreeNodeWithParent(2);
        TreeNodeWithParent.connect(t1, null, t2, null);
        TreeNodeWithParent.connect(t2, t1, null, null);
        TreeNodeWithParent actual = solution.findNextNode(t1);
        assertEquals(null, actual);
    }

    //      1
    //    /
    //  2
    @Test
    public void Test3() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent t2 = new TreeNodeWithParent(2);
        TreeNodeWithParent.connect(t1, null, t2, null);
        TreeNodeWithParent.connect(t2, t1, null, null);
        TreeNodeWithParent actual = solution.findNextNode(t2);
        assertEquals(t1, actual);
    }

    //  1
    //   \
    //    2
    @Test
    public void Test4() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent t2 = new TreeNodeWithParent(2);
        TreeNodeWithParent.connect(t1, null, null, t2);
        TreeNodeWithParent.connect(t2, t1, null, null);
        TreeNodeWithParent actual = solution.findNextNode(t1);
        assertEquals(t2, actual);
    }

    //  1
    //   \
    //    2
    @Test
    public void Test5() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent t2 = new TreeNodeWithParent(2);
        TreeNodeWithParent.connect(t1, null, null, t2);
        TreeNodeWithParent.connect(t2, t1, null, null);
        TreeNodeWithParent actual = solution.findNextNode(t2);
        assertEquals(null, actual);
    }

    //          1
    //        /    
    //      2
    //   /    \
    //  3      4
    //   \    /
    //    5  6
    @Test
    public void Test6() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent t2 = new TreeNodeWithParent(2);
        TreeNodeWithParent t3 = new TreeNodeWithParent(3);
        TreeNodeWithParent t4 = new TreeNodeWithParent(4);
        TreeNodeWithParent t5 = new TreeNodeWithParent(5);
        TreeNodeWithParent t6 = new TreeNodeWithParent(6);
        TreeNodeWithParent.connect(t1, null, t2, null);
        TreeNodeWithParent.connect(t2, t1, t3, t4);
        TreeNodeWithParent.connect(t3, t2, null, t5);
        TreeNodeWithParent.connect(t4, t2, t6, null);
        TreeNodeWithParent.connect(t5, t3, null, null);
        TreeNodeWithParent.connect(t6, t4, null, null);
        TreeNodeWithParent actual = solution.findNextNode(t5);
        assertEquals(t2, actual);
    }

    //          1
    //        /    
    //      2
    //   /    \
    //  3      4
    //   \    /
    //    5  6
    @Test
    public void Test7() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent t2 = new TreeNodeWithParent(2);
        TreeNodeWithParent t3 = new TreeNodeWithParent(3);
        TreeNodeWithParent t4 = new TreeNodeWithParent(4);
        TreeNodeWithParent t5 = new TreeNodeWithParent(5);
        TreeNodeWithParent t6 = new TreeNodeWithParent(6);
        TreeNodeWithParent.connect(t1, null, t2, null);
        TreeNodeWithParent.connect(t2, t1, t3, t4);
        TreeNodeWithParent.connect(t3, t2, null, t5);
        TreeNodeWithParent.connect(t4, t2, t6, null);
        TreeNodeWithParent.connect(t5, t3, null, null);
        TreeNodeWithParent.connect(t6, t4, null, null);
        TreeNodeWithParent actual = solution.findNextNode(t3);
        assertEquals(t5, actual);
    }

    //          1
    //        /    
    //      2
    //   /    \
    //  3      4
    //   \    /
    //    5  6
    @Test
    public void Test8() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent t2 = new TreeNodeWithParent(2);
        TreeNodeWithParent t3 = new TreeNodeWithParent(3);
        TreeNodeWithParent t4 = new TreeNodeWithParent(4);
        TreeNodeWithParent t5 = new TreeNodeWithParent(5);
        TreeNodeWithParent t6 = new TreeNodeWithParent(6);
        TreeNodeWithParent.connect(t1, null, t2, null);
        TreeNodeWithParent.connect(t2, t1, t3, t4);
        TreeNodeWithParent.connect(t3, t2, null, t5);
        TreeNodeWithParent.connect(t4, t2, t6, null);
        TreeNodeWithParent.connect(t5, t3, null, null);
        TreeNodeWithParent.connect(t6, t4, null, null);
        TreeNodeWithParent actual = solution.findNextNode(t2);
        assertEquals(t6, actual);
    }

    //          1
    //        /    
    //      2
    //   /    \
    //  3      4
    //   \    /
    //    5  6
    @Test
    public void Test9() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent t2 = new TreeNodeWithParent(2);
        TreeNodeWithParent t3 = new TreeNodeWithParent(3);
        TreeNodeWithParent t4 = new TreeNodeWithParent(4);
        TreeNodeWithParent t5 = new TreeNodeWithParent(5);
        TreeNodeWithParent t6 = new TreeNodeWithParent(6);
        TreeNodeWithParent.connect(t1, null, t2, null);
        TreeNodeWithParent.connect(t2, t1, t3, t4);
        TreeNodeWithParent.connect(t3, t2, null, t5);
        TreeNodeWithParent.connect(t4, t2, t6, null);
        TreeNodeWithParent.connect(t5, t3, null, null);
        TreeNodeWithParent.connect(t6, t4, null, null);
        TreeNodeWithParent actual = solution.findNextNode(t4);
        assertEquals(t1, actual);
    }

    //          1
    //        /    
    //      2
    //   /    \
    //  3      4
    //   \    /
    //    5  6
    @Test
    public void Test10() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent t2 = new TreeNodeWithParent(2);
        TreeNodeWithParent t3 = new TreeNodeWithParent(3);
        TreeNodeWithParent t4 = new TreeNodeWithParent(4);
        TreeNodeWithParent t5 = new TreeNodeWithParent(5);
        TreeNodeWithParent t6 = new TreeNodeWithParent(6);
        TreeNodeWithParent.connect(t1, null, t2, null);
        TreeNodeWithParent.connect(t2, t1, t3, t4);
        TreeNodeWithParent.connect(t3, t2, null, t5);
        TreeNodeWithParent.connect(t4, t2, t6, null);
        TreeNodeWithParent.connect(t5, t3, null, null);
        TreeNodeWithParent.connect(t6, t4, null, null);
        TreeNodeWithParent actual = solution.findNextNode(t6);
        assertEquals(t4, actual);
    }

    //  1
    //     \
    //        2
    //     /     \
    //    3       4
    //    \      /
    //     5    6
    @Test
    public void Test11() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent t2 = new TreeNodeWithParent(2);
        TreeNodeWithParent t3 = new TreeNodeWithParent(3);
        TreeNodeWithParent t4 = new TreeNodeWithParent(4);
        TreeNodeWithParent t5 = new TreeNodeWithParent(5);
        TreeNodeWithParent t6 = new TreeNodeWithParent(6);
        TreeNodeWithParent.connect(t1, null, null, t2);
        TreeNodeWithParent.connect(t2, t1, t3, t4);
        TreeNodeWithParent.connect(t3, t2, null, t5);
        TreeNodeWithParent.connect(t4, t2, t6, null);
        TreeNodeWithParent.connect(t5, t3, null, null);
        TreeNodeWithParent.connect(t6, t4, null, null);
        TreeNodeWithParent actual = solution.findNextNode(t2);
        assertEquals(t6, actual);
    }

    //  1
    //     \
    //        2
    //     /     \
    //    3       4
    //    \      /
    //     5    6
    @Test
    public void Test12() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent t2 = new TreeNodeWithParent(2);
        TreeNodeWithParent t3 = new TreeNodeWithParent(3);
        TreeNodeWithParent t4 = new TreeNodeWithParent(4);
        TreeNodeWithParent t5 = new TreeNodeWithParent(5);
        TreeNodeWithParent t6 = new TreeNodeWithParent(6);
        TreeNodeWithParent.connect(t1, null, null, t2);
        TreeNodeWithParent.connect(t2, t1, t3, t4);
        TreeNodeWithParent.connect(t3, t2, null, t5);
        TreeNodeWithParent.connect(t4, t2, t6, null);
        TreeNodeWithParent.connect(t5, t3, null, null);
        TreeNodeWithParent.connect(t6, t4, null, null);
        TreeNodeWithParent actual = solution.findNextNode(t3);
        assertEquals(t5, actual);
    }

    //  1
    //     \
    //        2
    //     /     \
    //    3       4
    //    \      /
    //     5    6
    @Test
    public void Test13() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent t2 = new TreeNodeWithParent(2);
        TreeNodeWithParent t3 = new TreeNodeWithParent(3);
        TreeNodeWithParent t4 = new TreeNodeWithParent(4);
        TreeNodeWithParent t5 = new TreeNodeWithParent(5);
        TreeNodeWithParent t6 = new TreeNodeWithParent(6);
        TreeNodeWithParent.connect(t1, null, null, t2);
        TreeNodeWithParent.connect(t2, t1, t3, t4);
        TreeNodeWithParent.connect(t3, t2, null, t5);
        TreeNodeWithParent.connect(t4, t2, t6, null);
        TreeNodeWithParent.connect(t5, t3, null, null);
        TreeNodeWithParent.connect(t6, t4, null, null);
        TreeNodeWithParent actual = solution.findNextNode(t5);
        assertEquals(t2, actual);
    }

    //  1
    //     \
    //        2
    //     /     \
    //    3       4
    //    \      /
    //     5    6
    @Test
    public void Test14() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent t2 = new TreeNodeWithParent(2);
        TreeNodeWithParent t3 = new TreeNodeWithParent(3);
        TreeNodeWithParent t4 = new TreeNodeWithParent(4);
        TreeNodeWithParent t5 = new TreeNodeWithParent(5);
        TreeNodeWithParent t6 = new TreeNodeWithParent(6);
        TreeNodeWithParent.connect(t1, null, null, t2);
        TreeNodeWithParent.connect(t2, t1, t3, t4);
        TreeNodeWithParent.connect(t3, t2, null, t5);
        TreeNodeWithParent.connect(t4, t2, t6, null);
        TreeNodeWithParent.connect(t5, t3, null, null);
        TreeNodeWithParent.connect(t6, t4, null, null);
        TreeNodeWithParent actual = solution.findNextNode(t2);
        assertEquals(t6, actual);
    }

    //  1
    //     \
    //        2
    //     /     \
    //    3       4
    //    \      /
    //     5    6
    @Test
    public void Test15() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent t2 = new TreeNodeWithParent(2);
        TreeNodeWithParent t3 = new TreeNodeWithParent(3);
        TreeNodeWithParent t4 = new TreeNodeWithParent(4);
        TreeNodeWithParent t5 = new TreeNodeWithParent(5);
        TreeNodeWithParent t6 = new TreeNodeWithParent(6);
        TreeNodeWithParent.connect(t1, null, null, t2);
        TreeNodeWithParent.connect(t2, t1, t3, t4);
        TreeNodeWithParent.connect(t3, t2, null, t5);
        TreeNodeWithParent.connect(t4, t2, t6, null);
        TreeNodeWithParent.connect(t5, t3, null, null);
        TreeNodeWithParent.connect(t6, t4, null, null);
        TreeNodeWithParent actual = solution.findNextNode(t6);
        assertEquals(t4, actual);
    }

    //  1
    //     \
    //        2
    //     /     \
    //    3       4
    //    \      /
    //     5    6
    @Test
    public void Test16() {
        TreeNodeWithParent t1 = new TreeNodeWithParent(1);
        TreeNodeWithParent t2 = new TreeNodeWithParent(2);
        TreeNodeWithParent t3 = new TreeNodeWithParent(3);
        TreeNodeWithParent t4 = new TreeNodeWithParent(4);
        TreeNodeWithParent t5 = new TreeNodeWithParent(5);
        TreeNodeWithParent t6 = new TreeNodeWithParent(6);
        TreeNodeWithParent.connect(t1, null, null, t2);
        TreeNodeWithParent.connect(t2, t1, t3, t4);
        TreeNodeWithParent.connect(t3, t2, null, t5);
        TreeNodeWithParent.connect(t4, t2, t6, null);
        TreeNodeWithParent.connect(t5, t3, null, null);
        TreeNodeWithParent.connect(t6, t4, null, null);
        TreeNodeWithParent actual = solution.findNextNode(t4);
        assertEquals(null, actual);
    }

}

package ch4.Q1_RouteBetweenNodes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import ch4.Q1_RouteBetweenNodes.Solution;

import com.careercup.DirectedGraphNode;

public class SolutionTest {
    
    /** Test method for {@link ch4.Q1_RouteBetweenNodes.Solution } */
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
    public void Test1() {
        DirectedGraphNode n1 = new DirectedGraphNode(1);
        DirectedGraphNode n2 = new DirectedGraphNode(2);
        n1.addAdjacent(n2);
        DirectedGraphNode start = n1;
        DirectedGraphNode end = n2;
        assertTrue(solution.hasRoute(start, end));
    }

    @Test
    public void Test2() {
        DirectedGraphNode n1 = new DirectedGraphNode(1);
        DirectedGraphNode n2 = new DirectedGraphNode(2);
        DirectedGraphNode n3 = new DirectedGraphNode(3);
        n1.addAdjacent(n2);
        n2.addAdjacent(n3);
        DirectedGraphNode start = n1;
        DirectedGraphNode end = n3;
        assertTrue(solution.hasRoute(start, end));
    }

    @Test
    public void Test3() {
        DirectedGraphNode n1 = new DirectedGraphNode(1);
        DirectedGraphNode n2 = new DirectedGraphNode(2);
        DirectedGraphNode n3 = new DirectedGraphNode(3);
        n1.addAdjacent(n2);
        n1.addAdjacent(n3);
        DirectedGraphNode start = n1;
        DirectedGraphNode end = n3;
        assertTrue(solution.hasRoute(start, end));
    }

    @Test
    public void Test4() {
        DirectedGraphNode n1 = new DirectedGraphNode(1);
        DirectedGraphNode n2 = new DirectedGraphNode(2);
        DirectedGraphNode start = n1;
        DirectedGraphNode end = n2;
        assertTrue(!solution.hasRoute(start, end));
    }

    @Test
    public void Test5() {
        DirectedGraphNode n1 = new DirectedGraphNode(1);
        DirectedGraphNode n2 = new DirectedGraphNode(2);
        n1.addAdjacent(n1);
        n1.addAdjacent(n2);
        n2.addAdjacent(n1);
        DirectedGraphNode start = n1;
        DirectedGraphNode end = n2;
        assertTrue(solution.hasRoute(start, end));
    }

    @Test
    public void Test6() {
        DirectedGraphNode n1 = new DirectedGraphNode(1);
        DirectedGraphNode n2 = new DirectedGraphNode(2);
        DirectedGraphNode n3 = new DirectedGraphNode(3);
        n1.addAdjacent(n1);
        n2.addAdjacent(n1);
        n2.addAdjacent(n3);
        DirectedGraphNode start = n1;
        DirectedGraphNode end = n2;
        assertTrue(!solution.hasRoute(start, end));
    }

    @Test
    public void Test7() {
        DirectedGraphNode n1 = null;
        DirectedGraphNode n2 = new DirectedGraphNode(2);
        DirectedGraphNode n3 = new DirectedGraphNode(3);
        n2.addAdjacent(n1);
        n2.addAdjacent(n3);
        DirectedGraphNode start = n1;
        DirectedGraphNode end = n2;
        assertTrue(!solution.hasRoute(start, end));
    }

    @Test
    public void Test8() {
        DirectedGraphNode n1 = new DirectedGraphNode(1);
        DirectedGraphNode n2 = null;
        DirectedGraphNode start = n1;
        DirectedGraphNode end = n2;
        assertTrue(!solution.hasRoute(start, end));
    }

    @Test
    public void Test9() {
        DirectedGraphNode n1 = new DirectedGraphNode(1);
        DirectedGraphNode n2 = null;
        n1.addAdjacent(n2);
        DirectedGraphNode start = n1;
        DirectedGraphNode end = n2;
        assertTrue(solution.hasRoute(start, end));
    }


    @Test
    public void Test10() {
        DirectedGraphNode n1 = new DirectedGraphNode(1);
        DirectedGraphNode n2 = new DirectedGraphNode(2);
        DirectedGraphNode n3 = null;
        n1.addAdjacent(n1);
        n1.addAdjacent(n2);
        DirectedGraphNode start = n1;
        DirectedGraphNode end = n3;
        assertTrue(!solution.hasRoute(start, end));
    }

}

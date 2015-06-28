package ch4.Q2_FindRouteInGraph;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.careercup.DirectedGraphNode;

public class PracticeTest {
    
    /** Test method for {@link ch4.Q2_FindRouteInGraph.Solution } */
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
        DirectedGraphNode n3 = new DirectedGraphNode(2);
        n1.addAdjacent(n1);
        n2.addAdjacent(n1);
        n2.addAdjacent(n3);
        DirectedGraphNode start = n1;
        DirectedGraphNode end = n2;
        assertTrue(!solution.hasRoute(start, end));
    }

}

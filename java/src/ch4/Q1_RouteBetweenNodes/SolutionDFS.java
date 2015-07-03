/**
 * Time: O(N); Space: O()
 *************************************************************************
 * Description:
 * 
 * Given a directed graph, design an algorithm to find whether there is a
 * route between two nodes.
 *
 *************************************************************************
 * @tag  : Depth-first Search; Graph
 * @date : Jun 27, 2015
 */
package ch4.Q1_RouteBetweenNodes;

import java.util.HashSet;
import java.util.Set;

import com.careercup.DirectedGraphNode;

public class SolutionDFS {
    public boolean hasRoute(DirectedGraphNode start, DirectedGraphNode end) {
        Set<DirectedGraphNode> visited = new HashSet<>();
        return hasRoute(start, end, visited);
    }

    private boolean hasRoute(DirectedGraphNode start, DirectedGraphNode end,
            Set<DirectedGraphNode> visited) {
        if (start == null) {
            return end == null;
        } else if (visited.contains(start)) {
            return false;
        } else {
            visited.add(start);
            if (start == end) {
                return true;
            } else {
                for (DirectedGraphNode adj : start.getAdjacent()) {
                    if (hasRoute(adj, end, visited)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}

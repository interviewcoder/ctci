/**
 * Time: O(N); Space: O(N)
 *************************************************************************
 * Description:
 * 
 * Given a directed graph, design an algorithm to find whether there is a
 * route between two nodes.
 *
 *************************************************************************
 * @tag  : Graph
 * @date : Jun 27, 2015
 */
package ch4.Q1_RouteBetweenNodes;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import com.careercup.DirectedGraphNode;

public class Solution {

    public boolean hasRoute(DirectedGraphNode start, DirectedGraphNode end) {
        if (start == null) {
            return false;
        }
        Queue<DirectedGraphNode> queue = new LinkedList<>();
        Set<DirectedGraphNode> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            DirectedGraphNode node = queue.poll();
            for (DirectedGraphNode adj : node.getAdjacent()) {
                if (!visited.contains(adj)) {
                    if (adj == end) {
                        // found
                        return true;
                    } else {
                        queue.add(adj);
                        visited.add(adj);
                    }
                }
            }
        }
        return false;
    }

}

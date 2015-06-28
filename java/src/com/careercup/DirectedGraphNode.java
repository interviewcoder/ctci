package com.careercup;

import java.util.ArrayList;
import java.util.List;

public class DirectedGraphNode {
    
    private int label;
    
    private List<DirectedGraphNode> adjList = new ArrayList<>();
    
    public DirectedGraphNode(int label) {
        setLabel(label);
    }
    
    public boolean addAdjacent(DirectedGraphNode node) {
        return adjList.add(node);
    }
    
    public List<DirectedGraphNode> getAdjacent() {
        return adjList;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

}

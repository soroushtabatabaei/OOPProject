package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Circuit {
    HashSet<Node> nodes= new HashSet<Node>();

    public HashSet<Node> getNodes() {
        return nodes;
    }

    public void setNodes(HashSet<Node> nodes) {
        this.nodes = nodes;
    }
    public Circuit(HashSet<Node> nodes) {
        this.nodes = nodes;
        nodes.add(null);
        System.out.println();
    }
}

package com.github.martinfrank.eoblegacy.map;

import com.github.martinfrank.eoblegacy.mapdata.DemoMapNodeData;
import com.github.martinfrank.mazelib.map.MazeMapNode;

public class DemoMapNode extends MazeMapNode<DemoMapNodeData, DemoMapField, DemoMapEdge, DemoMapNode> {

    public DemoMapNode(DemoMapNodeData demoMapNodeData) {
        super(demoMapNodeData);
    }

}

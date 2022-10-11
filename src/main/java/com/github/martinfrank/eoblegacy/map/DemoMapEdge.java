package com.github.martinfrank.eoblegacy.map;

import com.github.martinfrank.eoblegacy.mapdata.DemoMapEdgeData;
import com.github.martinfrank.mazelib.map.MazeMapEdge;

public class DemoMapEdge extends MazeMapEdge<DemoMapEdgeData, DemoMapField, DemoMapEdge, DemoMapNode> {

    public DemoMapEdge(DemoMapEdgeData mapEdgeData) {
        super(mapEdgeData);
    }

}

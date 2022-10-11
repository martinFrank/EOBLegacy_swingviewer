package com.github.martinfrank.eoblegacy.map;

import com.github.martinfrank.eoblegacy.mapdata.DemoMapData;
import com.github.martinfrank.eoblegacy.mapdata.DemoMapEdgeData;
import com.github.martinfrank.eoblegacy.mapdata.DemoMapFieldData;
import com.github.martinfrank.eoblegacy.mapdata.DemoMapNodeData;
import com.github.martinfrank.maplib.MapStyle;
import com.github.martinfrank.mazelib.map.MazeMapPartFactory;

public class DemoMapPartFactory extends MazeMapPartFactory<DemoMap, DemoMapField, DemoMapEdge, DemoMapNode, DemoMapWalker> {

    @Override
    public DemoMapNode createMapNode() {
        return new DemoMapNode(new DemoMapNodeData());
    }

    @Override
    public DemoMapEdge createMapEdge() {
        return new DemoMapEdge(new DemoMapEdgeData());
    }

    @Override
    public DemoMapField createMapField() {
        return new DemoMapField(new DemoMapFieldData());
    }

    @Override
    public DemoMap createMap(int columns, int rows, MapStyle style) {
        return new DemoMap(columns, rows, style, new DemoMapData());
    }

    @Override
    public DemoMapWalker createWalker() {
        return new DemoMapWalker();
    }
}

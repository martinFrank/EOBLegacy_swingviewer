package com.github.martinfrank.eoblegacy.map;

import com.github.martinfrank.maplib.MapFactory;
import com.github.martinfrank.maplib.MapPartFactory;
import com.github.martinfrank.mazelib.map.MazeMapFactory;

public class DemoMapFactory extends MazeMapFactory<DemoMap, DemoMapField, DemoMapEdge, DemoMapNode, DemoMapWalker> {

    public DemoMapFactory(MapPartFactory<DemoMap, DemoMapField, DemoMapEdge, DemoMapNode, DemoMapWalker> mapPartFactory) {
        super(mapPartFactory);
    }
}

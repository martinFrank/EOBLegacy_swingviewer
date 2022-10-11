package com.github.martinfrank.eoblegacy.map;

import com.github.martinfrank.maplib.MapWalker;
import com.github.martinfrank.mazelib.map.MazeMapWalker;

import java.util.List;

public class DemoMapWalker extends MazeMapWalker<DemoMapField, DemoMapEdge, DemoMapNode> {

    @Override
    public boolean canEnter(DemoMapField from, DemoMapField into) {
        return true;
    }

    @Override
    public int getEnterCosts(DemoMapField from, DemoMapField into) {
        return (int) into.getData().getWalkCostFactor() * 10;
    }

    @Override
    public List<DemoMapField> getNeighbours(DemoMapField field) {
        return getNeighboursFromEdges(field);
    }
}

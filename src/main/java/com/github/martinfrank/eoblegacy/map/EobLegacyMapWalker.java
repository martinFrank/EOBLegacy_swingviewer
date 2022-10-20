package com.github.martinfrank.eoblegacy.map;

import com.github.martinfrank.maplib2.astar.Walker;

public class EobLegacyMapWalker extends Walker<EobLegacyMapField, EobLegacyMapEdge> {

    @Override
    public boolean canEnter(EobLegacyMapField from, EobLegacyMapField into) {
        return true;
    }

    @Override
    public double getEnterCosts(EobLegacyMapField from, EobLegacyMapField into) {
        return 10;
    }

}

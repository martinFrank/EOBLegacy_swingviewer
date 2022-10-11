package com.github.martinfrank.eoblegacy.map;

import com.github.martinfrank.eoblegacy.mapdata.DemoMapFieldData;
import com.github.martinfrank.mazelib.map.MazeMapField;

public class DemoMapField extends MazeMapField<DemoMapFieldData, DemoMapField, DemoMapEdge, DemoMapNode> {

    public DemoMapField(DemoMapFieldData demoMapFieldData) {
        super(demoMapFieldData);
    }

    public boolean isSolid(){
        for(DemoMapEdge edge: getEdges()){
            if (edge.getData().getPassage().isOpen()){
                return false;
            }
        }
        return true;
    }

}

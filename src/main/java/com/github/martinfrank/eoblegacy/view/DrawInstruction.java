package com.github.martinfrank.eoblegacy.view;

import com.github.martinfrank.eoblegacy.resources.ImageId;
import com.github.martinfrank.eoblegacy.resources.TileClipping;
import com.github.martinfrank.eoblegacy.resources.TileLocation;

public class DrawInstruction {
    public final ImageId tileSetId;
    public final TileClipping tileClipping;
    public final TileLocation tileLocation;

    public DrawInstruction(ImageId tileSetId, TileClipping tileClipping, TileLocation tileLocation) {
        this.tileSetId = tileSetId;
        this.tileClipping = tileClipping;
        this.tileLocation = tileLocation;
    }
}

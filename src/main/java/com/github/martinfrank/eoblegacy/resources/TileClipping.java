package com.github.martinfrank.eoblegacy.resources;

import java.awt.Rectangle;

public enum TileClipping {

    //640x240 --> 40x40 raster --> breit 80 für untere zeile
    FIRST_ROW_LEFT(320, 120, 41, 120),//361,239
    FIRST_ROW_CENTER(480, 120, 160, 120),
    FIRST_ROW_RIGHT(438, 120, 41, 120),

    SECOND_ROW_VERY_LEFT(480, 0, 80, 120), //57,227
    SECOND_ROW_LEFT(0, 120, 80, 120), //57,227
    SECOND_ROW_CENTER(200, 120, 81, 120),//278,227,
    SECOND_ROW_RIGHT(80, 120, 80, 120), //57,227
    SECOND_ROW_VERY_RIGHT(560, 0, 80, 120), //57,227

    THIRD_ROW_VERY_LEFT(0, 0, 80, 120),
    THIRD_ROW_LEFT(160, 0, 80, 120),
    THIRD_ROW_CENTER(360, 0, 80, 120),
    THIRD_ROW_RIGHT(240, 0, 80, 120),
    THIRD_ROW_VERY_RIGHT(80, 0, 80, 120);

    public final int x0;
    public final int y0;
    public final int width;
    public final int height;

    TileClipping(int x0, int y0, int width, int height) {
        this.x0 = x0;
        this.y0 = y0;
        this.width = width;
        this.height = height;
    }

}

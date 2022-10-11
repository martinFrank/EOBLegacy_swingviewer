package com.github.martinfrank.eoblegacy.resources;

public enum TileLocation {

    FIRST_ROW_LEFT(0,0), //160b, 120h
    FIRST_ROW_CENTER(0,0),
    FIRST_ROW_RIGHT(120,0),

    SECOND_ROW_VERY_LEFT (0,0),
    SECOND_ROW_LEFT (0,0),
    SECOND_ROW_CENTER (40,0),
    SECOND_ROW_RIGHT  (80,0),
    SECOND_ROW_VERY_RIGHT  (80,0),

    THIRD_ROW_VERY_LEFT (0,0),
    THIRD_ROW_LEFT (0,0),
    THIRD_ROW_CENTER (40,0),
    THIRD_ROW_RIGHT (80,0),
    THIRD_ROW_VERY_RIGHT (80,0);


    public final int x;
    public final int y;

    TileLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

}

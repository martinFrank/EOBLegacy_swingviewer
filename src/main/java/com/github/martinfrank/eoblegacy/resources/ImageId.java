package com.github.martinfrank.eoblegacy.resources;

public enum ImageId {

    DUNGEON_WALL("dungeon_wall.png"),
    DUNGEON_FLOOR("dungeon_floor.png"),
    DUNGEON_CEILING("dungeon_ceiling.png");

    public final String filename;
    ImageId(String filename){
        this.filename = filename;
    }
}

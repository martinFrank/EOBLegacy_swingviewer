package com.github.martinfrank.eoblegacy.model;

import com.github.martinfrank.eoblegacy.map.EobLegacyMapField;

public class Monster{

    private Direction lookingDirection = Direction.NORTH;
    private EobLegacyMapField field;
    public boolean isHero() {
        return false;
    }

    public EobLegacyMapField getField() {
        return field;
    }

    public void setField(EobLegacyMapField field) {
        this.field = field;
    }

    public Direction getLookingDirection() {
        return lookingDirection;
    }

    public void setLookingDirection(Direction lookingDirection) {
        this.lookingDirection = lookingDirection;
    }

    @Override
    public String toString() {

        return "Monster{" +
                "lookingDirection=" + lookingDirection +
                '}';
    }
}

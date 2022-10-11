package com.github.martinfrank.eoblegacy.model;

import com.github.martinfrank.eoblegacy.map.DemoMapField;

public class Monster{

    private Direction lookingDirection = Direction.NORTH;
    private DemoMapField field;
    public boolean isHero() {
        return false;
    }

    public DemoMapField getField() {
        return field;
    }

    public void setField(DemoMapField field) {
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

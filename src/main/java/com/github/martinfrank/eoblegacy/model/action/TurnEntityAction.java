package com.github.martinfrank.eoblegacy.model.action;

import com.github.martinfrank.eoblegacy.model.Direction;
import com.github.martinfrank.eoblegacy.model.Monster;
import com.github.martinfrank.eoblegacy.model.Rotation;

public class TurnEntityAction implements Action{

    private final Monster monster;
    private final Rotation rotation;
    public TurnEntityAction(Monster monster, Rotation rotation) {
        this.monster = monster;
        this.rotation = rotation;
    }

    @Override
    public boolean execute() {
        Direction current = monster.getLookingDirection();
        Direction rotated = Direction.rotate(current, rotation);
        monster.setLookingDirection(rotated);
        return true;
    }
}

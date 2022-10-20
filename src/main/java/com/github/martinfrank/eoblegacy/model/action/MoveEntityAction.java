package com.github.martinfrank.eoblegacy.model.action;

import com.github.martinfrank.eoblegacy.map.EobLegacyMap;
import com.github.martinfrank.eoblegacy.map.EobLegacyMapField;
import com.github.martinfrank.eoblegacy.model.Direction;
import com.github.martinfrank.eoblegacy.model.Monster;
import com.github.martinfrank.eoblegacy.model.MoveDirection;

public class MoveEntityAction implements Action{

    private final Monster monster;
    private final MoveDirection moveDirection;
    private final EobLegacyMap map;

    public MoveEntityAction(Monster monster, EobLegacyMap map, MoveDirection moveDirection) {
        this.monster = monster;
        this.moveDirection = moveDirection;
        this.map = map;
    }

    @Override
    public boolean execute() {
        Direction direction = monster.getLookingDirection();
        EobLegacyMapField source = map.findField(monster);
        EobLegacyMapField destiny = map.getMovementDestiny(source, direction, moveDirection);
        if(map.isMovementAllowed(monster, source, destiny)){
            map.moveMonster(monster, source, destiny);
            return true;
        }
        return false;
    }
}

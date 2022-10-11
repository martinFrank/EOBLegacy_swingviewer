package com.github.martinfrank.eoblegacy.model.action;

import com.github.martinfrank.eoblegacy.map.DemoMap;
import com.github.martinfrank.eoblegacy.map.DemoMapField;
import com.github.martinfrank.eoblegacy.model.Direction;
import com.github.martinfrank.eoblegacy.model.Monster;
import com.github.martinfrank.eoblegacy.model.MoveDirection;
import com.github.martinfrank.eoblegacy.model.Rotation;

public class MoveEntityAction implements Action{

    private final Monster monster;
    private final MoveDirection moveDirection;
    private final DemoMap map;

    public MoveEntityAction(Monster monster, DemoMap map, MoveDirection moveDirection) {
        this.monster = monster;
        this.moveDirection = moveDirection;
        this.map = map;
    }

    @Override
    public boolean execute() {
        Direction direction = monster.getLookingDirection();
        DemoMapField source = map.findField(monster);
        DemoMapField destiny = map.getMovementDestiny(source, direction, moveDirection);
        if(map.isMovementAllowed(monster, source, destiny)){
            map.moveMonster(monster, source, destiny);
            return true;
        }
        return false;
    }
}

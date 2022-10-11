package com.github.martinfrank.eoblegacy.model.action;

import com.github.martinfrank.eoblegacy.map.DemoMapField;
import com.github.martinfrank.eoblegacy.model.*;

public class SetMonsterAction implements Action{

    private final DemoMapField field;
    private final Monster monster;

    public SetMonsterAction(Monster monster, DemoMapField field) {
        this.monster = monster;
        this.field = field;
    }

    @Override
    public boolean execute() {
        if(field.getData().getMonster() != null){
            return false;
        }
        field.getData().setMonster(monster);
        monster.setField(field);
        return true;
    }
}

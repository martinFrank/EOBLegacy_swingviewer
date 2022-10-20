package com.github.martinfrank.eoblegacy.model.action;

import com.github.martinfrank.eoblegacy.map.EobLegacyMapField;
import com.github.martinfrank.eoblegacy.model.*;

public class SetMonsterAction implements Action{

    private final EobLegacyMapField field;
    private final Monster monster;

    public SetMonsterAction(Monster monster, EobLegacyMapField field) {
        this.monster = monster;
        this.field = field;
    }

    @Override
    public boolean execute() {
        if(field.getMonster() != null){
            return false;
        }
        field.setMonster(monster);
        monster.setField(field);
        return true;
    }
}

package com.github.martinfrank.eoblegacy.map;

import com.github.martinfrank.eoblegacy.model.Monster;
import com.github.martinfrank.maplib2.map.Field;

public class EobLegacyMapField extends Field<EobLegacyMapField, EobLegacyMapEdge, EobLegacyMapNode> {

    private Monster monster;
    public EobLegacyMapField(Field<EobLegacyMapField, EobLegacyMapEdge, EobLegacyMapNode> template) {
        super(template);
    }

    public boolean isSolid(){
        for(EobLegacyMapEdge edge: edges){
            if (edge.isPassable()){
                return false;
            }
        }
        return true;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Monster getMonster(){
        return monster;
    }

    public boolean isHeroField(){
        return monster != null && monster.isHero();
    }





}

package com.github.martinfrank.eoblegacy.map;

import com.github.martinfrank.eoblegacy.model.Direction;
import com.github.martinfrank.eoblegacy.model.Hero;
import com.github.martinfrank.eoblegacy.model.Monster;
import com.github.martinfrank.eoblegacy.model.MoveDirection;
import com.github.martinfrank.eoblegacy.view.HeroView;
import com.github.martinfrank.maplib2.map.Map;

public class EobLegacyMap extends Map<EobLegacyMapField, EobLegacyMapEdge, EobLegacyMapNode> {

    private Map<EobLegacyMapField, EobLegacyMapEdge, EobLegacyMapNode> myMap;
    public EobLegacyMap(Map<EobLegacyMapField, EobLegacyMapEdge, EobLegacyMapNode> sample) {
       super(sample);
    }

    public HeroView createHeroView() {
        Hero hero = findHero();
        HeroView heroView = new HeroView();
        heroView.create(this, hero);
        return heroView;
    }

    public Hero findHero() {
        for (EobLegacyMapField field: getFields()){
            if (field.isHeroField() ){
                return (Hero) field.getMonster();
            }
        }
        throw new IllegalStateException("no hero found");
    }

    public EobLegacyMapField getMovementDestiny(EobLegacyMapField from, Direction current, MoveDirection moveDirection) {
        if(from == null){
            return null;
        }
        int x = from.position.x;
        int y = from.position.y;
        int dx = Direction.getDx(current, moveDirection);
        int dy = Direction.getDy(current, moveDirection);
        return getField(x+dx,y+dy);
    }

    public EobLegacyMapField findField(Monster monster){
        for (EobLegacyMapField field: getFields() ){
            if(monster.equals(field.getMonster())){
                return field;
            }
        }
        return null;
    }

    public void moveMonster(Monster monster, EobLegacyMapField source, EobLegacyMapField destiny) {
        source.setMonster(null);
        destiny.setMonster(monster);
        monster.setField(destiny);
    }

    public boolean isMovementAllowed(Monster monster, EobLegacyMapField source, EobLegacyMapField destiny) {
        if(monster == null){
            return false;
        }
        if(source == null){
            return false;
        }
        if(destiny == null){
            return false;
        }
        if(destiny.getMonster() != null){
            return false;
        }
        EobLegacyMapEdge edge = source.getEdge(destiny);
        return edge.isPassable();
    }

}

package com.github.martinfrank.eoblegacy.map;

import com.github.martinfrank.eoblegacy.mapdata.DemoMapData;
import com.github.martinfrank.eoblegacy.model.Direction;
import com.github.martinfrank.eoblegacy.model.Hero;
import com.github.martinfrank.eoblegacy.model.Monster;
import com.github.martinfrank.eoblegacy.model.MoveDirection;
import com.github.martinfrank.eoblegacy.model.algorithm.RoomGeneration;
import com.github.martinfrank.eoblegacy.view.HeroView;
import com.github.martinfrank.maplib.MapStyle;
import com.github.martinfrank.mazelib.map.MazeMap;

public class DemoMap extends MazeMap<DemoMapData, DemoMapField, DemoMapEdge, DemoMapNode, DemoMapWalker> {


    public DemoMap(int width, int height, MapStyle style, DemoMapData demoMapData) {
        super(width, height, style, demoMapData);
    }

    public HeroView createHeroView() {
        Hero hero = findHero();
        HeroView heroView = new HeroView();
        heroView.create(this, hero);
        return heroView;
    }

    public Hero findHero() {
        for (DemoMapField field: getFields() ){
            if (field.getData().isHeroField() ){
                return (Hero) field.getData().getMonster();
            }
        }
        throw new IllegalStateException("no hero found");
    }

    public DemoMapField getMovementDestiny(DemoMapField from, Direction current, MoveDirection moveDirection) {
        if(from == null){
            return null;
        }
        int x = from.getIndex().getX();
        int y = from.getIndex().getY();
        int dx = Direction.getDx(current, moveDirection);
        int dy = Direction.getDy(current, moveDirection);
        return getField(x+dx,y+dy);
    }

    public DemoMapField findField(Monster monster){
        for (DemoMapField field: getFields() ){
            if(monster.equals(field.getData().getMonster())){
                return field;
            }
        }
        return null;
    }

    public void moveMonster(Monster monster, DemoMapField source, DemoMapField destiny) {
        source.getData().setMonster(null);
        destiny.getData().setMonster(monster);
        monster.setField(destiny);
    }

    public boolean isMovementAllowed(Monster monster, DemoMapField source, DemoMapField destiny) {
        if(monster == null){
            return false;
        }
        if(source == null){
            return false;
        }
        if(destiny == null){
            return false;
        }
        if(destiny.getData().getMonster() != null){
            return false;
        }
        DemoMapEdge edge = source.getEdge(destiny);
        return edge.getData().getPassage().isOpen();
    }

    public void createRooms() {
        RoomGeneration.insertRooms(this);
        RoomGeneration.insertRooms(this);
    }
}

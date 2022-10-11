package com.github.martinfrank.eoblegacy.mapdata;

import com.github.martinfrank.eoblegacy.model.Monster;
import com.github.martinfrank.mazelib.mapdata.MazeMapFieldData;

public class DemoMapFieldData extends MazeMapFieldData {

    private boolean isRoom;

    public double getWalkCostFactor() {
        return 1d;
    }

    private Monster monster;

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Monster getMonster(){
        return monster;
    }

    public boolean isHeroField(){
        return monster != null && monster.isHero();
    }

    public void setRoom(boolean isRoom) {
        this.isRoom = isRoom;
        setDeadEnd(false);
    }

    public boolean isRoom(){
        return isRoom;
    }
}

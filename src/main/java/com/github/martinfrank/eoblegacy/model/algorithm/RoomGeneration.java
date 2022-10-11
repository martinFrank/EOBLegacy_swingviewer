package com.github.martinfrank.eoblegacy.model.algorithm;

import com.github.martinfrank.eoblegacy.map.DemoMap;
import com.github.martinfrank.eoblegacy.map.DemoMapEdge;
import com.github.martinfrank.eoblegacy.map.DemoMapField;
import com.github.martinfrank.geolib.GeoPoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RoomGeneration {
    public static void insertRooms(DemoMap demoMap) {
        Room room = Math.random()<0.5?new Room(3,2):new Room(2,3);
        DemoMapField topLeft = null;
        int value = Integer.MIN_VALUE;

        List<DemoMapField> fields = new ArrayList<>(demoMap.getFields());
        Collections.shuffle(fields);
        for(DemoMapField field: fields ){

            int currentValue = calculatePosition(demoMap, field, room);
            if(currentValue > value){
                value = currentValue;
                topLeft = field;
            }
        }

        setRoom(demoMap, room, topLeft);
    }

    private static void setRoom(DemoMap demoMap, Room room, DemoMapField topLeft) {
        for (int dy = 1; dy < room.height; dy++){
            for (int dx = 1; dx < room.width; dx++){
                int x = topLeft.getIndex().getX() + dx;
                int y = topLeft.getIndex().getY() + dy;
                DemoMapField roomField = demoMap.getField(x,y);
                DemoMapField roomFieldNorth = demoMap.getField(x,y-1);
                DemoMapField roomFieldWest = demoMap.getField(x-1,y);
                DemoMapField roomFieldNorthWest = demoMap.getField(x-1,y-1);
                roomField.getEdge(roomFieldNorth).getData().getPassage().setOpen(true);
                roomField.getEdge(roomFieldWest).getData().getPassage().setOpen(true);
                roomFieldNorth.getEdge(roomFieldNorthWest).getData().getPassage().setOpen(true);
                roomFieldWest.getEdge(roomFieldNorthWest).getData().getPassage().setOpen(true);
                roomField.getData().setBlocked(false);
                roomField.getData().setRoom(true);
                roomFieldNorth.getData().setRoom(true);
                roomFieldWest.getData().setRoom(true);
                roomFieldNorthWest.getData().setRoom(true);

            }
        }
    }

    private static int calculatePosition(DemoMap demoMap, DemoMapField field, Room room) {
        int value = 0;
        for (int dy = 0; dy < room.height; dy++){
            for (int dx = 0; dx < room.width; dx++){
                int x = field.getIndex().getX() + dx;
                int y = field.getIndex().getY() + dy;
                DemoMapField roomField = demoMap.getField(x,y);
                if(roomField == null){
                    value = value - 10000;
                }else{
                    value = value + (roomField.getData().isBlocked()?-250:1000);

                    if(roomField.getIndex().getX() == 0
                            || roomField.getIndex().getY() == 0
                            || roomField.getIndex().getX() == demoMap.getColumns()-1
                            || roomField.getIndex().getY() == demoMap.getRows()-1){
                        value = value - 10000;
                    }

                    if (roomField.getData().isRoom()){
                        value = value - 10000;
                    }
                }
            }
        }
        return value;
    }
}
